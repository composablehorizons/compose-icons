package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Lock: ImageVector
    get() {
        if (_Lock != null) return _Lock!!
        
        _Lock = ImageVector.Builder(
            name = "lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 224f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-72f)
                curveTo(376f, 68.2f, 307.8f, 0f, 224f, 0f)
                reflectiveCurveTo(72f, 68.2f, 72f, 152f)
                verticalLineToRelative(72f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, 21.5f, -48f, 48f)
                verticalLineToRelative(192f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(272f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveToRelative(-104f, 0f)
                horizontalLineTo(152f)
                verticalLineToRelative(-72f)
                curveToRelative(0f, -39.7f, 32.3f, -72f, 72f, -72f)
                reflectiveCurveToRelative(72f, 32.3f, 72f, 72f)
                verticalLineToRelative(72f)
                close()
            }
        }.build()
        
        return _Lock!!
    }

private var _Lock: ImageVector? = null

