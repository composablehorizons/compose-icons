package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.Cog8Tooth: ImageVector
    get() {
        if (_Cog8Tooth != null) return _Cog8Tooth!!
        
        _Cog8Tooth = ImageVector.Builder(
            name = "cog-8-tooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(10.343f, 3.94f)
                curveToRelative(0.09f, -0.542f, 0.56f, -0.94f, 1.11f, -0.94f)
                horizontalLineToRelative(1.093f)
                curveToRelative(0.55f, 0f, 1.02f, 0.398f, 1.11f, 0.94f)
                lineToRelative(0.149f, 0.894f)
                curveToRelative(0.07f, 0.424f, 0.384f, 0.764f, 0.78f, 0.93f)
                curveToRelative(0.398f, 0.164f, 0.855f, 0.142f, 1.205f, -0.108f)
                lineToRelative(0.737f, -0.527f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, 1.45f, 0.12f)
                lineToRelative(0.773f, 0.774f)
                curveToRelative(0.39f, 0.389f, 0.44f, 1.002f, 0.12f, 1.45f)
                lineToRelative(-0.527f, 0.737f)
                curveToRelative(-0.25f, 0.35f, -0.272f, 0.806f, -0.107f, 1.204f)
                curveToRelative(0.165f, 0.397f, 0.505f, 0.71f, 0.93f, 0.78f)
                lineToRelative(0.893f, 0.15f)
                curveToRelative(0.543f, 0.09f, 0.94f, 0.559f, 0.94f, 1.109f)
                verticalLineToRelative(1.094f)
                curveToRelative(0f, 0.55f, -0.397f, 1.02f, -0.94f, 1.11f)
                lineToRelative(-0.894f, 0.149f)
                curveToRelative(-0.424f, 0.07f, -0.764f, 0.383f, -0.929f, 0.78f)
                curveToRelative(-0.165f, 0.398f, -0.143f, 0.854f, 0.107f, 1.204f)
                lineToRelative(0.527f, 0.738f)
                curveToRelative(0.32f, 0.447f, 0.269f, 1.06f, -0.12f, 1.45f)
                lineToRelative(-0.774f, 0.773f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -1.449f, 0.12f)
                lineToRelative(-0.738f, -0.527f)
                curveToRelative(-0.35f, -0.25f, -0.806f, -0.272f, -1.203f, -0.107f)
                curveToRelative(-0.398f, 0.165f, -0.71f, 0.505f, -0.781f, 0.929f)
                lineToRelative(-0.149f, 0.894f)
                curveToRelative(-0.09f, 0.542f, -0.56f, 0.94f, -1.11f, 0.94f)
                horizontalLineToRelative(-1.094f)
                curveToRelative(-0.55f, 0f, -1.019f, -0.398f, -1.11f, -0.94f)
                lineToRelative(-0.148f, -0.894f)
                curveToRelative(-0.071f, -0.424f, -0.384f, -0.764f, -0.781f, -0.93f)
                curveToRelative(-0.398f, -0.164f, -0.854f, -0.142f, -1.204f, 0.108f)
                lineToRelative(-0.738f, 0.527f)
                curveToRelative(-0.447f, 0.32f, -1.06f, 0.269f, -1.45f, -0.12f)
                lineToRelative(-0.773f, -0.774f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, -0.12f, -1.45f)
                lineToRelative(0.527f, -0.737f)
                curveToRelative(0.25f, -0.35f, 0.272f, -0.806f, 0.108f, -1.204f)
                curveToRelative(-0.165f, -0.397f, -0.506f, -0.71f, -0.93f, -0.78f)
                lineToRelative(-0.894f, -0.15f)
                curveToRelative(-0.542f, -0.09f, -0.94f, -0.56f, -0.94f, -1.109f)
                verticalLineToRelative(-1.094f)
                curveToRelative(0f, -0.55f, 0.398f, -1.02f, 0.94f, -1.11f)
                lineToRelative(0.894f, -0.149f)
                curveToRelative(0.424f, -0.07f, 0.765f, -0.383f, 0.93f, -0.78f)
                curveToRelative(0.165f, -0.398f, 0.143f, -0.854f, -0.108f, -1.204f)
                lineToRelative(-0.526f, -0.738f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, 0.12f, -1.45f)
                lineToRelative(0.773f, -0.773f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, 1.45f, -0.12f)
                lineToRelative(0.737f, 0.527f)
                curveToRelative(0.35f, 0.25f, 0.807f, 0.272f, 1.204f, 0.107f)
                curveToRelative(0.397f, -0.165f, 0.71f, -0.505f, 0.78f, -0.929f)
                lineToRelative(0.15f, -0.894f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(15f, 12f)
                arcToRelative(3f, 3f, 0f, true, true, -6f, 0f)
                arcToRelative(3f, 3f, 0f, false, true, 6f, 0f)
                close()
            }
        }.build()
        
        return _Cog8Tooth!!
    }

private var _Cog8Tooth: ImageVector? = null

