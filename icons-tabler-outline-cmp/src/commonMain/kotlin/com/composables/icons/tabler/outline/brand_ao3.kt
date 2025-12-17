package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandAo3: ImageVector
    get() {
        if (_BrandAo3 != null) return _BrandAo3!!
        
        _BrandAo3 = ImageVector.Builder(
            name = "brand-ao3",
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
                moveTo(2f, 5f)
                curveToRelative(7.109f, 4.1f, 10.956f, 10.131f, 12f, 14f)
                curveToRelative(1.074f, -4.67f, 4.49f, -8.94f, 8f, -11f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 8f)
                moveToRelative(-2f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, 4f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, -4f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 9f)
                curveToRelative(-0.278f, 5.494f, -2.337f, 7.33f, -4f, 10f)
                curveToRelative(4.013f, -2f, 6.02f, -5f, 15.05f, -5f)
                curveToRelative(4.012f, 0f, 3.51f, 2.5f, 1f, 3f)
                curveToRelative(2f, 0.5f, 2.508f, 5f, -2.007f, 2f)
            }
        }.build()
        
        return _BrandAo3!!
    }

private var _BrandAo3: ImageVector? = null

