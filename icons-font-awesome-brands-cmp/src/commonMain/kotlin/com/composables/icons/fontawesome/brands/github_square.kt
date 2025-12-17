package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.GithubSquare: ImageVector
    get() {
        if (_GithubSquare != null) return _GithubSquare!!
        
        _GithubSquare = ImageVector.Builder(
            name = "github-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 32f)
                horizontalLineTo(48f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveTo(277.3f, 415.7f)
                curveToRelative(-8.4f, 1.5f, -11.5f, -3.7f, -11.5f, -8f)
                curveToRelative(0f, -5.4f, 0.2f, -33f, 0.2f, -55.3f)
                curveToRelative(0f, -15.6f, -5.2f, -25.5f, -11.3f, -30.7f)
                curveToRelative(37f, -4.1f, 76f, -9.2f, 76f, -73.1f)
                curveToRelative(0f, -18.2f, -6.5f, -27.3f, -17.1f, -39f)
                curveToRelative(1.7f, -4.3f, 7.4f, -22f, -1.7f, -45f)
                curveToRelative(-13.9f, -4.3f, -45.7f, 17.9f, -45.7f, 17.9f)
                curveToRelative(-13.2f, -3.7f, -27.5f, -5.6f, -41.6f, -5.6f)
                curveToRelative(-14.1f, 0f, -28.4f, 1.9f, -41.6f, 5.6f)
                curveToRelative(0f, 0f, -31.8f, -22.2f, -45.7f, -17.9f)
                curveToRelative(-9.1f, 22.9f, -3.5f, 40.6f, -1.7f, 45f)
                curveToRelative(-10.6f, 11.7f, -15.6f, 20.8f, -15.6f, 39f)
                curveToRelative(0f, 63.6f, 37.3f, 69f, 74.3f, 73.1f)
                curveToRelative(-4.8f, 4.3f, -9.1f, 11.7f, -10.6f, 22.3f)
                curveToRelative(-9.5f, 4.3f, -33.8f, 11.7f, -48.3f, -13.9f)
                curveToRelative(-9.1f, -15.8f, -25.5f, -17.1f, -25.5f, -17.1f)
                curveToRelative(-16.2f, -0.2f, -1.1f, 10.2f, -1.1f, 10.2f)
                curveToRelative(10.8f, 5f, 18.4f, 24.2f, 18.4f, 24.2f)
                curveToRelative(9.7f, 29.7f, 56.1f, 19.7f, 56.1f, 19.7f)
                curveToRelative(0f, 13.9f, 0.2f, 36.5f, 0.2f, 40.6f)
                curveToRelative(0f, 4.3f, -3f, 9.5f, -11.5f, 8f)
                curveToRelative(-66f, -22.1f, -112.2f, -84.9f, -112.2f, -158.3f)
                curveToRelative(0f, -91.8f, 70.2f, -161.5f, 162f, -161.5f)
                reflectiveCurveTo(388f, 165.6f, 388f, 257.4f)
                curveToRelative(0.1f, 73.4f, -44.7f, 136.3f, -110.7f, 158.3f)
                close()
                moveToRelative(-98.1f, -61.1f)
                curveToRelative(-1.9f, 0.4f, -3.7f, -0.4f, -3.9f, -1.7f)
                curveToRelative(-0.2f, -1.5f, 1.1f, -2.8f, 3f, -3.2f)
                curveToRelative(1.9f, -0.2f, 3.7f, 0.6f, 3.9f, 1.9f)
                curveToRelative(0.3f, 1.3f, -1f, 2.6f, -3f, 3f)
                close()
                moveToRelative(-9.5f, -0.9f)
                curveToRelative(0f, 1.3f, -1.5f, 2.4f, -3.5f, 2.4f)
                curveToRelative(-2.2f, 0.2f, -3.7f, -0.9f, -3.7f, -2.4f)
                curveToRelative(0f, -1.3f, 1.5f, -2.4f, 3.5f, -2.4f)
                curveToRelative(1.9f, -0.2f, 3.7f, 0.9f, 3.7f, 2.4f)
                close()
                moveToRelative(-13.7f, -1.1f)
                curveToRelative(-0.4f, 1.3f, -2.4f, 1.9f, -4.1f, 1.3f)
                curveToRelative(-1.9f, -0.4f, -3.2f, -1.9f, -2.8f, -3.2f)
                curveToRelative(0.4f, -1.3f, 2.4f, -1.9f, 4.1f, -1.5f)
                curveToRelative(2f, 0.6f, 3.3f, 2.1f, 2.8f, 3.4f)
                close()
                moveToRelative(-12.3f, -5.4f)
                curveToRelative(-0.9f, 1.1f, -2.8f, 0.9f, -4.3f, -0.6f)
                curveToRelative(-1.5f, -1.3f, -1.9f, -3.2f, -0.9f, -4.1f)
                curveToRelative(0.9f, -1.1f, 2.8f, -0.9f, 4.3f, 0.6f)
                curveToRelative(1.3f, 1.3f, 1.8f, 3.3f, 0.9f, 4.1f)
                close()
                moveToRelative(-9.1f, -9.1f)
                curveToRelative(-0.9f, 0.6f, -2.6f, 0f, -3.7f, -1.5f)
                reflectiveCurveToRelative(-1.1f, -3.2f, 0f, -3.9f)
                curveToRelative(1.1f, -0.9f, 2.8f, -0.2f, 3.7f, 1.3f)
                curveToRelative(1.1f, 1.5f, 1.1f, 3.3f, 0f, 4.1f)
                close()
                moveToRelative(-6.5f, -9.7f)
                curveToRelative(-0.9f, 0.9f, -2.4f, 0.4f, -3.5f, -0.6f)
                curveToRelative(-1.1f, -1.3f, -1.3f, -2.8f, -0.4f, -3.5f)
                curveToRelative(0.9f, -0.9f, 2.4f, -0.4f, 3.5f, 0.6f)
                curveToRelative(1.1f, 1.3f, 1.3f, 2.8f, 0.4f, 3.5f)
                close()
                moveToRelative(-6.7f, -7.4f)
                curveToRelative(-0.4f, 0.9f, -1.7f, 1.1f, -2.8f, 0.4f)
                curveToRelative(-1.3f, -0.6f, -1.9f, -1.7f, -1.5f, -2.6f)
                curveToRelative(0.4f, -0.6f, 1.5f, -0.9f, 2.8f, -0.4f)
                curveToRelative(1.3f, 0.7f, 1.9f, 1.8f, 1.5f, 2.6f)
                close()
            }
        }.build()
        
        return _GithubSquare!!
    }

private var _GithubSquare: ImageVector? = null

