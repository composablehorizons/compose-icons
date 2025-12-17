package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandBitbucket: ImageVector
    get() {
        if (_BrandBitbucket != null) return _BrandBitbucket!!
        
        _BrandBitbucket = ImageVector.Builder(
            name = "brand-bitbucket",
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
                moveTo(3.648f, 4f)
                arcToRelative(0.64f, 0.64f, 0f, false, false, -0.64f, 0.744f)
                lineToRelative(3.14f, 14.528f)
                curveToRelative(0.07f, 0.417f, 0.43f, 0.724f, 0.852f, 0.728f)
                horizontalLineToRelative(10f)
                arcToRelative(0.644f, 0.644f, 0f, false, false, 0.642f, -0.539f)
                lineToRelative(3.35f, -14.71f)
                arcToRelative(0.641f, 0.641f, 0f, false, false, -0.64f, -0.744f)
                lineToRelative(-16.704f, -0.007f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 15f)
                horizontalLineToRelative(-4f)
                lineToRelative(-1f, -6f)
                horizontalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _BrandBitbucket!!
    }

private var _BrandBitbucket: ImageVector? = null

