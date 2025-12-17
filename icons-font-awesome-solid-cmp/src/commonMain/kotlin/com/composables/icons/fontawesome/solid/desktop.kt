package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Desktop: ImageVector
    get() {
        if (_Desktop != null) return _Desktop!!
        
        _Desktop = ImageVector.Builder(
            name = "desktop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(528f, 0f)
                horizontalLineTo(48f)
                curveTo(21.5f, 0f, 0f, 21.5f, 0f, 48f)
                verticalLineToRelative(320f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(192f)
                lineToRelative(-16f, 48f)
                horizontalLineToRelative(-72f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                reflectiveCurveToRelative(10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(272f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                reflectiveCurveToRelative(-10.7f, -24f, -24f, -24f)
                horizontalLineToRelative(-72f)
                lineToRelative(-16f, -48f)
                horizontalLineToRelative(192f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(48f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveToRelative(-16f, 352f)
                horizontalLineTo(64f)
                verticalLineTo(64f)
                horizontalLineToRelative(448f)
                verticalLineToRelative(288f)
                close()
            }
        }.build()
        
        return _Desktop!!
    }

private var _Desktop: ImageVector? = null

