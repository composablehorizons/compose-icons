package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Coffee: ImageVector
    get() {
        if (_Coffee != null) return _Coffee!!
        
        _Coffee = ImageVector.Builder(
            name = "coffee",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(192f, 384f)
                horizontalLineToRelative(192f)
                curveToRelative(53f, 0f, 96f, -43f, 96f, -96f)
                horizontalLineToRelative(32f)
                curveToRelative(70.6f, 0f, 128f, -57.4f, 128f, -128f)
                reflectiveCurveTo(582.6f, 32f, 512f, 32f)
                horizontalLineTo(120f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                verticalLineToRelative(232f)
                curveToRelative(0f, 53f, 43f, 96f, 96f, 96f)
                close()
                moveTo(512f, 96f)
                curveToRelative(35.3f, 0f, 64f, 28.7f, 64f, 64f)
                reflectiveCurveToRelative(-28.7f, 64f, -64f, 64f)
                horizontalLineToRelative(-32f)
                verticalLineTo(96f)
                horizontalLineToRelative(32f)
                close()
                moveToRelative(47.7f, 384f)
                horizontalLineTo(48.3f)
                curveToRelative(-47.6f, 0f, -61f, -64f, -36f, -64f)
                horizontalLineToRelative(583.3f)
                curveToRelative(25f, 0f, 11.8f, 64f, -35.9f, 64f)
                close()
            }
        }.build()
        
        return _Coffee!!
    }

private var _Coffee: ImageVector? = null

