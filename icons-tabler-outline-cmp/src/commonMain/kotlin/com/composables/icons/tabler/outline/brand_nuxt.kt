package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandNuxt: ImageVector
    get() {
        if (_BrandNuxt != null) return _BrandNuxt!!
        
        _BrandNuxt = ImageVector.Builder(
            name = "brand-nuxt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.146f, 8.583f)
                lineToRelative(-1.3f, -2.09f)
                arcToRelative(1.046f, 1.046f, 0f, false, false, -1.786f, 0.017f)
                lineToRelative(-5.91f, 9.908f)
                arcToRelative(1.046f, 1.046f, 0f, false, false, 0.897f, 1.582f)
                horizontalLineToRelative(3.913f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.043f, 18f)
                curveToRelative(0.743f, 0f, 1.201f, -0.843f, 0.82f, -1.505f)
                lineToRelative(-4.044f, -7.013f)
                arcToRelative(0.936f, 0.936f, 0f, false, false, -1.638f, 0f)
                lineToRelative(-4.043f, 7.013f)
                curveToRelative(-0.382f, 0.662f, 0.076f, 1.505f, 0.819f, 1.505f)
                horizontalLineToRelative(8.086f)
                close()
            }
        }.build()
        
        return _BrandNuxt!!
    }

private var _BrandNuxt: ImageVector? = null

