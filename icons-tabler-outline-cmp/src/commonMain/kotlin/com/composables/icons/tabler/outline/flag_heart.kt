package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.FlagHeart: ImageVector
    get() {
        if (_FlagHeart != null) return _FlagHeart!!
        
        _FlagHeart = ImageVector.Builder(
            name = "flag-heart",
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
                moveTo(11.33f, 13.447f)
                arcToRelative(5.001f, 5.001f, 0f, false, false, -6.33f, 0.553f)
                verticalLineToRelative(-9f)
                arcToRelative(5f, 5f, 0f, false, true, 7f, 0f)
                arcToRelative(5f, 5f, 0f, false, false, 7f, 0f)
                verticalLineToRelative(6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 21f)
                verticalLineToRelative(-7f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 22f)
                lineToRelative(3.35f, -3.284f)
                arcToRelative(2.143f, 2.143f, 0f, false, false, 0.005f, -3.071f)
                arcToRelative(2.242f, 2.242f, 0f, false, false, -3.129f, -0.006f)
                lineToRelative(-0.224f, 0.22f)
                lineToRelative(-0.223f, -0.22f)
                arcToRelative(2.242f, 2.242f, 0f, false, false, -3.128f, -0.006f)
                arcToRelative(2.143f, 2.143f, 0f, false, false, -0.006f, 3.071f)
                lineToRelative(3.355f, 3.296f)
                close()
            }
        }.build()
        
        return _FlagHeart!!
    }

private var _FlagHeart: ImageVector? = null

