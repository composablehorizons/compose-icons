package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Strikethrough: ImageVector
    get() {
        if (_Strikethrough != null) return _Strikethrough!!
        
        _Strikethrough = ImageVector.Builder(
            name = "strikethrough",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.165f, 3.654f)
                curveToRelative(-0.95f, -0.255f, -1.921f, -0.273f, -2.693f, -0.042f)
                curveToRelative(-0.769f, 0.231f, -1.087f, 0.624f, -1.173f, 0.947f)
                curveToRelative(-0.087f, 0.323f, -0.008f, 0.822f, 0.543f, 1.407f)
                curveToRelative(0.389f, 0.412f, 0.927f, 0.77f, 1.55f, 1.034f)
                horizontalLineTo(13f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(3f)
                arcTo(0.75f, 0.75f, 0f, false, true, 3f, 7f)
                horizontalLineToRelative(1.756f)
                lineToRelative(-0.006f, -0.006f)
                curveToRelative(-0.787f, -0.835f, -1.161f, -1.849f, -0.9f, -2.823f)
                curveToRelative(0.26f, -0.975f, 1.092f, -1.666f, 2.191f, -1.995f)
                curveToRelative(1.097f, -0.33f, 2.36f, -0.28f, 3.512f, 0.029f)
                curveToRelative(0.75f, 0.2f, 1.478f, 0.518f, 2.11f, 0.939f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.833f, 1.248f)
                arcToRelative(5.682f, 5.682f, 0f, false, false, -1.665f, -0.738f)
                close()
                moveToRelative(2.074f, 6.365f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.91f, 0.543f)
                arcToRelative(2.44f, 2.44f, 0f, false, true, -0.35f, 2.024f)
                curveToRelative(-0.405f, 0.585f, -1.052f, 1.003f, -1.84f, 1.24f)
                curveToRelative(-1.098f, 0.329f, -2.36f, 0.279f, -3.512f, -0.03f)
                curveToRelative(-1.152f, -0.308f, -2.27f, -0.897f, -3.056f, -1.73f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.092f, -1.029f)
                curveToRelative(0.552f, 0.586f, 1.403f, 1.056f, 2.352f, 1.31f)
                curveToRelative(0.95f, 0.255f, 1.92f, 0.273f, 2.692f, 0.042f)
                curveToRelative(0.55f, -0.165f, 0.873f, -0.417f, 1.038f, -0.656f)
                arcToRelative(0.942f, 0.942f, 0f, false, false, 0.13f, -0.803f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.544f, -0.91f)
                close()
            }
        }.build()
        
        return _Strikethrough!!
    }

private var _Strikethrough: ImageVector? = null

