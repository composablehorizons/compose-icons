package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowPathRoundedSquare: ImageVector
    get() {
        if (_ArrowPathRoundedSquare != null) return _ArrowPathRoundedSquare!!
        
        _ArrowPathRoundedSquare = ImageVector.Builder(
            name = "arrow-path-rounded-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 3.5f)
                curveToRelative(-0.771f, 0f, -1.537f, 0.022f, -2.297f, 0.066f)
                arcToRelative(1.124f, 1.124f, 0f, false, false, -1.058f, 1.028f)
                lineToRelative(-0.018f, 0.214f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.495f, -0.12f)
                lineToRelative(0.018f, -0.221f)
                arcToRelative(2.624f, 2.624f, 0f, false, true, 2.467f, -2.399f)
                arcToRelative(41.628f, 41.628f, 0f, false, true, 4.766f, 0f)
                arcToRelative(2.624f, 2.624f, 0f, false, true, 2.467f, 2.399f)
                curveToRelative(0.056f, 0.662f, 0.097f, 1.329f, 0.122f, 2f)
                lineToRelative(0.748f, -0.748f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.06f)
                lineToRelative(-2f, 2.001f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.061f, 0f)
                lineToRelative(-2f, -1.999f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.061f, -1.06f)
                lineToRelative(0.689f, 0.688f)
                arcToRelative(39.89f, 39.89f, 0f, false, false, -0.114f, -1.815f)
                arcToRelative(1.124f, 1.124f, 0f, false, false, -1.058f, -1.028f)
                arcTo(40.138f, 40.138f, 0f, false, false, 8f, 3.5f)
                close()
                moveTo(3.22f, 7.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.061f, 0f)
                lineToRelative(2f, 2f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineToRelative(-0.69f, -0.69f)
                curveToRelative(0.025f, 0.61f, 0.062f, 1.214f, 0.114f, 1.816f)
                curveToRelative(0.048f, 0.56f, 0.496f, 0.996f, 1.058f, 1.028f)
                arcToRelative(40.112f, 40.112f, 0f, false, false, 4.594f, 0f)
                arcToRelative(1.124f, 1.124f, 0f, false, false, 1.058f, -1.028f)
                arcToRelative(39.2f, 39.2f, 0f, false, false, 0.018f, -0.219f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.495f, 0.12f)
                lineToRelative(-0.018f, 0.226f)
                arcToRelative(2.624f, 2.624f, 0f, false, true, -2.467f, 2.399f)
                arcToRelative(41.648f, 41.648f, 0f, false, true, -4.766f, 0f)
                arcToRelative(2.624f, 2.624f, 0f, false, true, -2.467f, -2.399f)
                arcToRelative(41.395f, 41.395f, 0f, false, true, -0.122f, -2f)
                lineToRelative(-0.748f, 0.748f)
                arcTo(0.75f, 0.75f, 0f, true, true, 1.22f, 9.22f)
                lineToRelative(2f, -2f)
                close()
            }
        }.build()
        
        return _ArrowPathRoundedSquare!!
    }

private var _ArrowPathRoundedSquare: ImageVector? = null

