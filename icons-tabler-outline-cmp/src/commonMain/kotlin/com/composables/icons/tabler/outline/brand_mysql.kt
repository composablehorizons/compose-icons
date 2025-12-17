package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandMysql: ImageVector
    get() {
        if (_BrandMysql != null) return _BrandMysql!!
        
        _BrandMysql = ImageVector.Builder(
            name = "brand-mysql",
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
                moveTo(13f, 21f)
                curveToRelative(-1.427f, -1.026f, -3.59f, -3.854f, -4f, -6f)
                curveToRelative(-0.486f, 0.77f, -1.501f, 2f, -2f, 2f)
                curveToRelative(-1.499f, -0.888f, -0.574f, -3.973f, 0f, -6f)
                curveToRelative(-1.596f, -1.433f, -2.468f, -2.458f, -2.5f, -4f)
                curveToRelative(-3.35f, -3.44f, -0.444f, -5.27f, 2.5f, -3f)
                horizontalLineToRelative(1f)
                curveToRelative(8.482f, 0.5f, 6.421f, 8.07f, 9f, 11.5f)
                curveToRelative(2.295f, 0.522f, 3.665f, 2.254f, 5f, 3.5f)
                curveToRelative(-2.086f, -0.2f, -2.784f, -0.344f, -3.5f, 0f)
                curveToRelative(0.478f, 1.64f, 2.123f, 2.2f, 3.5f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 7f)
                horizontalLineToRelative(0.01f)
            }
        }.build()
        
        return _BrandMysql!!
    }

private var _BrandMysql: ImageVector? = null

