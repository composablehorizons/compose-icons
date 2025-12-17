package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.GlassCocktail: ImageVector
    get() {
        if (_GlassCocktail != null) return _GlassCocktail!!
        
        _GlassCocktail = ImageVector.Builder(
            name = "glass-cocktail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 21f)
                horizontalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                verticalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 5f)
                moveToRelative(-7f, 0f)
                arcToRelative(7f, 2f, 0f, true, false, 14f, 0f)
                arcToRelative(7f, 2f, 0f, true, false, -14f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 5f)
                verticalLineToRelative(0.388f)
                curveToRelative(0f, 0.432f, 0.126f, 0.853f, 0.362f, 1.206f)
                lineToRelative(5f, 7.509f)
                curveToRelative(0.633f, 0.951f, 1.88f, 1.183f, 2.785f, 0.517f)
                curveToRelative(0.191f, -0.141f, 0.358f, -0.316f, 0.491f, -0.517f)
                lineToRelative(5f, -7.509f)
                curveToRelative(0.236f, -0.353f, 0.362f, -0.774f, 0.362f, -1.206f)
                verticalLineToRelative(-0.388f)
            }
        }.build()
        
        return _GlassCocktail!!
    }

private var _GlassCocktail: ImageVector? = null

