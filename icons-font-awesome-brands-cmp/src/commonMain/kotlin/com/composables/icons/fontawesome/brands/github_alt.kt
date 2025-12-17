package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.GithubAlt: ImageVector
    get() {
        if (_GithubAlt != null) return _GithubAlt!!
        
        _GithubAlt = ImageVector.Builder(
            name = "github-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 480f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(186.1f, 328.7f)
                curveToRelative(0f, 20.9f, -10.9f, 55.1f, -36.7f, 55.1f)
                reflectiveCurveToRelative(-36.7f, -34.2f, -36.7f, -55.1f)
                reflectiveCurveToRelative(10.9f, -55.1f, 36.7f, -55.1f)
                reflectiveCurveToRelative(36.7f, 34.2f, 36.7f, 55.1f)
                close()
                moveTo(480f, 278.2f)
                curveToRelative(0f, 31.9f, -3.2f, 65.7f, -17.5f, 95f)
                curveToRelative(-37.9f, 76.6f, -142.1f, 74.8f, -216.7f, 74.8f)
                curveToRelative(-75.8f, 0f, -186.2f, 2.7f, -225.6f, -74.8f)
                curveToRelative(-14.6f, -29f, -20.2f, -63.1f, -20.2f, -95f)
                curveToRelative(0f, -41.9f, 13.9f, -81.5f, 41.5f, -113.6f)
                curveToRelative(-5.2f, -15.8f, -7.7f, -32.4f, -7.7f, -48.8f)
                curveToRelative(0f, -21.5f, 4.9f, -32.3f, 14.6f, -51.8f)
                curveToRelative(45.3f, 0f, 74.3f, 9f, 108.8f, 36f)
                curveToRelative(29f, -6.9f, 58.8f, -10f, 88.7f, -10f)
                curveToRelative(27f, 0f, 54.2f, 2.9f, 80.4f, 9.2f)
                curveToRelative(34f, -26.7f, 63f, -35.2f, 107.8f, -35.2f)
                curveToRelative(9.8f, 19.5f, 14.6f, 30.3f, 14.6f, 51.8f)
                curveToRelative(0f, 16.4f, -2.6f, 32.7f, -7.7f, 48.2f)
                curveToRelative(27.5f, 32.4f, 39f, 72.3f, 39f, 114.2f)
                close()
                moveToRelative(-64.3f, 50.5f)
                curveToRelative(0f, -43.9f, -26.7f, -82.6f, -73.5f, -82.6f)
                curveToRelative(-18.9f, 0f, -37f, 3.4f, -56f, 6f)
                curveToRelative(-14.9f, 2.3f, -29.8f, 3.2f, -45.1f, 3.2f)
                curveToRelative(-15.2f, 0f, -30.1f, -0.9f, -45.1f, -3.2f)
                curveToRelative(-18.7f, -2.6f, -37f, -6f, -56f, -6f)
                curveToRelative(-46.8f, 0f, -73.5f, 38.7f, -73.5f, 82.6f)
                curveToRelative(0f, 87.8f, 80.4f, 101.3f, 150.4f, 101.3f)
                horizontalLineToRelative(48.2f)
                curveToRelative(70.3f, 0f, 150.6f, -13.4f, 150.6f, -101.3f)
                close()
                moveToRelative(-82.6f, -55.1f)
                curveToRelative(-25.8f, 0f, -36.7f, 34.2f, -36.7f, 55.1f)
                reflectiveCurveToRelative(10.9f, 55.1f, 36.7f, 55.1f)
                reflectiveCurveToRelative(36.7f, -34.2f, 36.7f, -55.1f)
                reflectiveCurveToRelative(-10.9f, -55.1f, -36.7f, -55.1f)
                close()
            }
        }.build()
        
        return _GithubAlt!!
    }

private var _GithubAlt: ImageVector? = null

