package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.GitAlt: ImageVector
    get() {
        if (_GitAlt != null) return _GitAlt!!
        
        _GitAlt = ImageVector.Builder(
            name = "git-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(439.55f, 236.05f)
                lineTo(244f, 40.45f)
                arcToRelative(28.87f, 28.87f, 0f, false, false, -40.81f, 0f)
                lineToRelative(-40.66f, 40.63f)
                lineToRelative(51.52f, 51.52f)
                curveToRelative(27.06f, -9.14f, 52.68f, 16.77f, 43.39f, 43.68f)
                lineToRelative(49.66f, 49.66f)
                curveToRelative(34.23f, -11.8f, 61.18f, 31f, 35.47f, 56.69f)
                curveToRelative(-26.49f, 26.49f, -70.21f, -2.87f, -56f, -37.34f)
                lineTo(240.22f, 199f)
                verticalLineToRelative(121.85f)
                curveToRelative(25.3f, 12.54f, 22.26f, 41.85f, 9.08f, 55f)
                arcToRelative(34.34f, 34.34f, 0f, false, true, -48.55f, 0f)
                curveToRelative(-17.57f, -17.6f, -11.07f, -46.91f, 11.25f, -56f)
                verticalLineToRelative(-123f)
                curveToRelative(-20.8f, -8.51f, -24.6f, -30.74f, -18.64f, -45f)
                lineTo(142.57f, 101f)
                lineTo(8.45f, 235.14f)
                arcToRelative(28.86f, 28.86f, 0f, false, false, 0f, 40.81f)
                lineToRelative(195.61f, 195.6f)
                arcToRelative(28.86f, 28.86f, 0f, false, false, 40.8f, 0f)
                lineToRelative(194.69f, -194.69f)
                arcToRelative(28.86f, 28.86f, 0f, false, false, 0f, -40.81f)
                close()
            }
        }.build()
        
        return _GitAlt!!
    }

private var _GitAlt: ImageVector? = null

