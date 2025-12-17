package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Lyft: ImageVector
    get() {
        if (_Lyft != null) return _Lyft!!
        
        _Lyft = ImageVector.Builder(
            name = "lyft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 81.1f)
                horizontalLineToRelative(77.8f)
                verticalLineToRelative(208.7f)
                curveToRelative(0f, 33.1f, 15f, 52.8f, 27.2f, 61f)
                curveToRelative(-12.7f, 11.1f, -51.2f, 20.9f, -80.2f, -2.8f)
                curveTo(7.8f, 334f, 0f, 310.7f, 0f, 289f)
                verticalLineTo(81.1f)
                close()
                moveToRelative(485.9f, 173.5f)
                verticalLineToRelative(-22f)
                horizontalLineToRelative(23.8f)
                verticalLineToRelative(-76.8f)
                horizontalLineToRelative(-26.1f)
                curveToRelative(-10.1f, -46.3f, -51.2f, -80.7f, -100.3f, -80.7f)
                curveToRelative(-56.6f, 0f, -102.7f, 46f, -102.7f, 102.7f)
                verticalLineTo(357f)
                curveToRelative(16f, 2.3f, 35.4f, -0.3f, 51.7f, -14f)
                curveToRelative(17.1f, -14f, 24.8f, -37.2f, 24.8f, -59f)
                verticalLineToRelative(-6.7f)
                horizontalLineToRelative(38.8f)
                verticalLineToRelative(-76.8f)
                horizontalLineToRelative(-38.8f)
                verticalLineToRelative(-23.3f)
                curveToRelative(0f, -34.6f, 52.2f, -34.6f, 52.2f, 0f)
                verticalLineToRelative(77.1f)
                curveToRelative(0f, 56.6f, 46f, 102.7f, 102.7f, 102.7f)
                verticalLineToRelative(-76.5f)
                curveToRelative(-14.5f, 0f, -26.1f, -11.7f, -26.1f, -25.9f)
                close()
                moveToRelative(-294.3f, -99f)
                verticalLineToRelative(113f)
                curveToRelative(0f, 15.4f, -23.8f, 15.4f, -23.8f, 0f)
                verticalLineToRelative(-113f)
                horizontalLineTo(91f)
                verticalLineToRelative(132.7f)
                curveToRelative(0f, 23.8f, 8f, 54f, 45f, 63.9f)
                curveToRelative(37f, 9.8f, 58.2f, -10.6f, 58.2f, -10.6f)
                curveToRelative(-2.1f, 13.4f, -14.5f, 23.3f, -34.9f, 25.3f)
                curveToRelative(-15.5f, 1.6f, -35.2f, -3.6f, -45f, -7.8f)
                verticalLineToRelative(70.3f)
                curveToRelative(25.1f, 7.5f, 51.5f, 9.8f, 77.6f, 4.7f)
                curveToRelative(47.1f, -9.1f, 76.8f, -48.4f, 76.8f, -100.8f)
                verticalLineTo(155.1f)
                horizontalLineToRelative(-77.1f)
                verticalLineToRelative(0.5f)
                close()
            }
        }.build()
        
        return _Lyft!!
    }

private var _Lyft: ImageVector? = null

