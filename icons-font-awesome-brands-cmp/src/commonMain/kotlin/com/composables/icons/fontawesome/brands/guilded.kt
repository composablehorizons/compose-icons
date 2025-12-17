package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Guilded: ImageVector
    get() {
        if (_Guilded != null) return _Guilded!!
        
        _Guilded = ImageVector.Builder(
            name = "guilded",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(443.427f, 64f)
                horizontalLineTo(4.571f)
                curveToRelative(0f, 103.26f, 22.192f, 180.06f, 43.418f, 222.358f)
                curveTo(112.046f, 414.135f, 224f, 448f, 225.256f, 448f)
                arcToRelative(312.824f, 312.824f, 0f, false, false, 140.55f, -103.477f)
                curveToRelative(25.907f, -33.923f, 53.1f, -87.19f, 65.916f, -145.761f)
                horizontalLineTo(171.833f)
                curveToRelative(4.14f, 36.429f, 22.177f, 67.946f, 45.1f, 86.944f)
                horizontalLineToRelative(88.589f)
                curveToRelative(-17.012f, 28.213f, -48.186f, 54.4f, -80.456f, 69.482f)
                curveToRelative(-31.232f, -13.259f, -69.09f, -46.544f, -96.548f, -98.362f)
                curveToRelative(-26.726f, -53.833f, -27.092f, -105.883f, -27.092f, -105.883f)
                horizontalLineTo(437.573f)
                arcTo(625.91f, 625.91f, 0f, false, false, 443.427f, 64f)
                close()
            }
        }.build()
        
        return _Guilded!!
    }

private var _Guilded: ImageVector? = null

