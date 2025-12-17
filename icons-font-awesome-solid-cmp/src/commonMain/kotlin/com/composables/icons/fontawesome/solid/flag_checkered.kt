package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.FlagCheckered: ImageVector
    get() {
        if (_FlagCheckered != null) return _FlagCheckered!!
        
        _FlagCheckered = ImageVector.Builder(
            name = "flag-checkered",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(243.2f, 189.9f)
                verticalLineTo(258f)
                curveToRelative(26.1f, 5.9f, 49.3f, 15.6f, 73.6f, 22.3f)
                verticalLineToRelative(-68.2f)
                curveToRelative(-26f, -5.8f, -49.4f, -15.5f, -73.6f, -22.2f)
                close()
                moveToRelative(223.3f, -123f)
                curveToRelative(-34.3f, 15.9f, -76.5f, 31.9f, -117f, 31.9f)
                curveTo(296f, 98.8f, 251.7f, 64f, 184.3f, 64f)
                curveToRelative(-25f, 0f, -47.3f, 4.4f, -68f, 12f)
                curveToRelative(2.8f, -7.3f, 4.1f, -15.2f, 3.6f, -23.6f)
                curveTo(118.1f, 24f, 94.8f, 1.2f, 66.3f, 0f)
                curveTo(34.3f, -1.3f, 8f, 24.3f, 8f, 56f)
                curveToRelative(0f, 19f, 9.5f, 35.8f, 24f, 45.9f)
                verticalLineTo(488f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(16f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineToRelative(-94.4f)
                curveToRelative(28.3f, -12.1f, 63.6f, -22.1f, 114.4f, -22.1f)
                curveToRelative(53.6f, 0f, 97.8f, 34.8f, 165.2f, 34.8f)
                curveToRelative(48.2f, 0f, 86.7f, -16.3f, 122.5f, -40.9f)
                curveToRelative(8.7f, -6f, 13.8f, -15.8f, 13.8f, -26.4f)
                verticalLineTo(95.9f)
                curveToRelative(0.1f, -23.3f, -24.2f, -38.8f, -45.4f, -29f)
                close()
                moveTo(169.6f, 325.5f)
                curveToRelative(-25.8f, 2.7f, -50f, 8.2f, -73.6f, 16.6f)
                verticalLineToRelative(-70.5f)
                curveToRelative(26.2f, -9.3f, 47.5f, -15f, 73.6f, -17.4f)
                close()
                moveTo(464f, 191f)
                curveToRelative(-23.6f, 9.8f, -46.3f, 19.5f, -73.6f, 23.9f)
                verticalLineTo(286f)
                curveToRelative(24.8f, -3.4f, 51.4f, -11.8f, 73.6f, -26f)
                verticalLineToRelative(70.5f)
                curveToRelative(-25.1f, 16.1f, -48.5f, 24.7f, -73.6f, 27.1f)
                verticalLineTo(286f)
                curveToRelative(-27f, 3.7f, -47.9f, 1.5f, -73.6f, -5.6f)
                verticalLineToRelative(67.4f)
                curveToRelative(-23.9f, -7.4f, -47.3f, -16.7f, -73.6f, -21.3f)
                verticalLineTo(258f)
                curveToRelative(-19.7f, -4.4f, -40.8f, -6.8f, -73.6f, -3.8f)
                verticalLineToRelative(-70f)
                curveToRelative(-22.4f, 3.1f, -44.6f, 10.2f, -73.6f, 20.9f)
                verticalLineToRelative(-70.5f)
                curveToRelative(33.2f, -12.2f, 50.1f, -19.8f, 73.6f, -22f)
                verticalLineToRelative(71.6f)
                curveToRelative(27f, -3.7f, 48.4f, -1.3f, 73.6f, 5.7f)
                verticalLineToRelative(-67.4f)
                curveToRelative(23.7f, 7.4f, 47.2f, 16.7f, 73.6f, 21.3f)
                verticalLineToRelative(68.4f)
                curveToRelative(23.7f, 5.3f, 47.6f, 6.9f, 73.6f, 2.7f)
                verticalLineTo(143f)
                curveToRelative(27f, -4.8f, 52.3f, -13.6f, 73.6f, -22.5f)
                close()
            }
        }.build()
        
        return _FlagCheckered!!
    }

private var _FlagCheckered: ImageVector? = null

