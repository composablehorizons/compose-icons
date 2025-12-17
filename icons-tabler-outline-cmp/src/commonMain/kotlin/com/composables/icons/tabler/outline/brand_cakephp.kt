package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandCakephp: ImageVector
    get() {
        if (_BrandCakephp != null) return _BrandCakephp!!
        
        _BrandCakephp = ImageVector.Builder(
            name = "brand-cakephp",
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
                moveTo(12f, 11f)
                lineToRelative(8f, 2f)
                curveToRelative(1.361f, -0.545f, 2f, -1.248f, 2f, -2f)
                verticalLineToRelative(-3.8f)
                curveToRelative(0f, -1.765f, -4.479f, -3.2f, -10.002f, -3.2f)
                curveToRelative(-5.522f, 0f, -9.998f, 1.435f, -9.998f, 3.2f)
                verticalLineToRelative(2.8f)
                curveToRelative(0f, 1.766f, 4.478f, 4f, 10f, 4f)
                verticalLineToRelative(-3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 14f)
                verticalLineToRelative(3f)
                lineToRelative(8f, 2f)
                curveToRelative(1.362f, -0.547f, 2f, -1.246f, 2f, -2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, 0.754f, -0.638f, 1.453f, -2f, 2f)
                lineToRelative(-8f, -2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 17f)
                curveToRelative(0f, 1.766f, 4.476f, 3f, 9.998f, 3f)
                lineToRelative(0.002f, -3f)
                curveToRelative(-5.522f, 0f, -10f, -1.734f, -10f, -3.5f)
                verticalLineToRelative(3.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2f, 10f)
                verticalLineToRelative(4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 10f)
                verticalLineToRelative(4f)
            }
        }.build()
        
        return _BrandCakephp!!
    }

private var _BrandCakephp: ImageVector? = null

