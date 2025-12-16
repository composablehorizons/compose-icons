package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.GithubLogo: ImageVector
    get() {
        if (_GithubLogo != null) return _GithubLogo!!
        
        _GithubLogo = ImageVector.Builder(
            name = "github-logo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.49902f, 0.25f)
                curveTo(11.5033f, 0.25f, 14.7499f, 3.4958f, 14.75f, 7.5f)
                curveTo(14.75f, 10.7023f, 12.6746f, 13.418f, 9.7959f, 14.3789f)
                curveTo(9.42852f, 14.4496f, 9.29802f, 14.2242f, 9.29785f, 14.0303f)
                curveTo(9.29785f, 13.7926f, 9.30664f, 13.0099f, 9.30664f, 12.041f)
                curveTo(9.30657f, 11.3647f, 9.07434f, 10.9221f, 8.81445f, 10.6982f)
                curveTo(10.4292f, 10.5189f, 12.125f, 9.90632f, 12.125f, 7.12109f)
                curveTo(12.125f, 6.32946f, 11.8444f, 5.68268f, 11.3799f, 5.17578f)
                curveTo(11.4542f, 4.99237f, 11.7023f, 4.25509f, 11.3066f, 3.25684f)
                curveTo(11.2917f, 3.25225f, 10.6824f, 3.07392f, 9.31543f, 4f)
                curveTo(8.73639f, 3.83933f, 8.11598f, 3.75897f, 7.5f, 3.75586f)
                curveTo(6.88373f, 3.75899f, 6.26356f, 3.83939f, 5.68555f, 4f)
                curveTo(4.30048f, 3.06223f, 3.69141f, 3.25684f, 3.69141f, 3.25684f)
                curveTo(3.29667f, 4.25506f, 3.54533f, 4.99237f, 3.62012f, 5.17578f)
                curveTo(3.15651f, 5.68268f, 2.87402f, 6.32946f, 2.87402f, 7.12109f)
                curveTo(2.87404f, 9.89919f, 4.56694f, 10.5207f, 6.17676f, 10.7041f)
                curveTo(5.96986f, 10.8852f, 5.78272f, 11.2049f, 5.7168f, 11.6729f)
                curveTo(5.3038f, 11.8584f, 4.25315f, 12.1788f, 3.60645f, 11.0713f)
                curveTo(3.60645f, 11.0713f, 3.2236f, 10.3756f, 2.49609f, 10.3242f)
                curveTo(2.49609f, 10.3242f, 1.78803f, 10.3151f, 2.44629f, 10.7646f)
                curveTo(2.46065f, 10.7715f, 2.92629f, 11.0006f, 3.25098f, 11.8252f)
                curveTo(3.25565f, 11.8405f, 3.6878f, 13.2324f, 5.69336f, 12.7969f)
                curveTo(5.69692f, 13.4017f, 5.70312f, 13.858f, 5.70312f, 14.0303f)
                curveTo(5.70295f, 14.2225f, 5.57051f, 14.4462f, 5.20801f, 14.3799f)
                curveTo(2.32708f, 13.4207f, 0.25f, 10.7027f, 0.25f, 7.5f)
                curveTo(0.250136f, 3.49591f, 3.49627f, 0.250167f, 7.49902f, 0.25f)
                close()
            }
        }.build()
        
        return _GithubLogo!!
    }

private var _GithubLogo: ImageVector? = null

