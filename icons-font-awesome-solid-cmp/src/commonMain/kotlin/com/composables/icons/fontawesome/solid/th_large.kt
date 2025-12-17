package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ThLarge: ImageVector
    get() {
        if (_ThLarge != null) return _ThLarge!!
        
        _ThLarge = ImageVector.Builder(
            name = "th-large",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(296f, 32f)
                horizontalLineToRelative(192f)
                curveToRelative(13.255f, 0f, 24f, 10.745f, 24f, 24f)
                verticalLineToRelative(160f)
                curveToRelative(0f, 13.255f, -10.745f, 24f, -24f, 24f)
                horizontalLineTo(296f)
                curveToRelative(-13.255f, 0f, -24f, -10.745f, -24f, -24f)
                verticalLineTo(56f)
                curveToRelative(0f, -13.255f, 10.745f, -24f, 24f, -24f)
                close()
                moveToRelative(-80f, 0f)
                horizontalLineTo(24f)
                curveTo(10.745f, 32f, 0f, 42.745f, 0f, 56f)
                verticalLineToRelative(160f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(192f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(56f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                close()
                moveTo(0f, 296f)
                verticalLineToRelative(160f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                horizontalLineToRelative(192f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(296f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineTo(24f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                close()
                moveToRelative(296f, 184f)
                horizontalLineToRelative(192f)
                curveToRelative(13.255f, 0f, 24f, -10.745f, 24f, -24f)
                verticalLineTo(296f)
                curveToRelative(0f, -13.255f, -10.745f, -24f, -24f, -24f)
                horizontalLineTo(296f)
                curveToRelative(-13.255f, 0f, -24f, 10.745f, -24f, 24f)
                verticalLineToRelative(160f)
                curveToRelative(0f, 13.255f, 10.745f, 24f, 24f, 24f)
                close()
            }
        }.build()
        
        return _ThLarge!!
    }

private var _ThLarge: ImageVector? = null

