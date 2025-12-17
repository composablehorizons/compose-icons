package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Amazon: ImageVector
    get() {
        if (_Amazon != null) return _Amazon!!
        
        _Amazon = ImageVector.Builder(
            name = "amazon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(257.2f, 162.7f)
                curveToRelative(-48.7f, 1.8f, -169.5f, 15.5f, -169.5f, 117.5f)
                curveToRelative(0f, 109.5f, 138.3f, 114f, 183.5f, 43.2f)
                curveToRelative(6.5f, 10.2f, 35.4f, 37.5f, 45.3f, 46.8f)
                lineToRelative(56.8f, -56f)
                reflectiveCurveTo(341f, 288.9f, 341f, 261.4f)
                verticalLineTo(114.3f)
                curveTo(341f, 89f, 316.5f, 32f, 228.7f, 32f)
                curveTo(140.7f, 32f, 94f, 87f, 94f, 136.3f)
                lineToRelative(73.5f, 6.8f)
                curveToRelative(16.3f, -49.5f, 54.2f, -49.5f, 54.2f, -49.5f)
                curveToRelative(40.7f, -0.1f, 35.5f, 29.8f, 35.5f, 69.1f)
                close()
                moveToRelative(0f, 86.8f)
                curveToRelative(0f, 80f, -84.2f, 68f, -84.2f, 17.2f)
                curveToRelative(0f, -47.2f, 50.5f, -56.7f, 84.2f, -57.8f)
                verticalLineToRelative(40.6f)
                close()
                moveToRelative(136f, 163.5f)
                curveToRelative(-7.7f, 10f, -70f, 67f, -174.5f, 67f)
                reflectiveCurveTo(34.2f, 408.5f, 9.7f, 379f)
                curveToRelative(-6.8f, -7.7f, 1f, -11.3f, 5.5f, -8.3f)
                curveTo(88.5f, 415.2f, 203f, 488.5f, 387.7f, 401f)
                curveToRelative(7.5f, -3.7f, 13.3f, 2f, 5.5f, 12f)
                close()
                moveToRelative(39.8f, 2.2f)
                curveToRelative(-6.5f, 15.8f, -16f, 26.8f, -21.2f, 31f)
                curveToRelative(-5.5f, 4.5f, -9.5f, 2.7f, -6.5f, -3.8f)
                reflectiveCurveToRelative(19.3f, -46.5f, 12.7f, -55f)
                curveToRelative(-6.5f, -8.3f, -37f, -4.3f, -48f, -3.2f)
                curveToRelative(-10.8f, 1f, -13f, 2f, -14f, -0.3f)
                curveToRelative(-2.3f, -5.7f, 21.7f, -15.5f, 37.5f, -17.5f)
                curveToRelative(15.7f, -1.8f, 41f, -0.8f, 46f, 5.7f)
                curveToRelative(3.7f, 5.1f, 0f, 27.1f, -6.5f, 43.1f)
                close()
            }
        }.build()
        
        return _Amazon!!
    }

private var _Amazon: ImageVector? = null

