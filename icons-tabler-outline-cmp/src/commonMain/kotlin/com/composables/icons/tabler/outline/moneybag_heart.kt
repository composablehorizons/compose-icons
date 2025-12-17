package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.MoneybagHeart: ImageVector
    get() {
        if (_MoneybagHeart != null) return _MoneybagHeart!!
        
        _MoneybagHeart = ImageVector.Builder(
            name = "moneybag-heart",
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
                moveTo(9.5f, 3f)
                horizontalLineToRelative(5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, 1.5f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -3.5f, 3.5f)
                horizontalLineToRelative(-1f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -3.5f, -3.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, -1.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.5f, 21f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, -4f)
                verticalLineToRelative(-1f)
                arcToRelative(8f, 8f, 0f, false, true, 14.376f, -4.833f)
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
                arcToRelative(2.24f, 2.24f, 0f, false, false, -3.129f, -0.006f)
                lineToRelative(-0.224f, 0.22f)
                lineToRelative(-0.223f, -0.22f)
                arcToRelative(2.24f, 2.24f, 0f, false, false, -3.128f, -0.006f)
                arcToRelative(2.143f, 2.143f, 0f, false, false, -0.006f, 3.071f)
                close()
            }
        }.build()
        
        return _MoneybagHeart!!
    }

private var _MoneybagHeart: ImageVector? = null

