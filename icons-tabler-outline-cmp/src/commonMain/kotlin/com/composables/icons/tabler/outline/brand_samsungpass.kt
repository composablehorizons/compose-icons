package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandSamsungpass: ImageVector
    get() {
        if (_BrandSamsungpass != null) return _BrandSamsungpass!!
        
        _BrandSamsungpass = ImageVector.Builder(
            name = "brand-samsungpass",
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
                moveTo(4f, 10f)
                moveToRelative(0f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 10f)
                verticalLineToRelative(-1.862f)
                curveToRelative(0f, -2.838f, 2.239f, -5.138f, 5f, -5.138f)
                reflectiveCurveToRelative(5f, 2.3f, 5f, 5.138f)
                verticalLineToRelative(1.862f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.485f, 17.577f)
                curveToRelative(0.337f, 0.29f, 0.7f, 0.423f, 1.515f, 0.423f)
                horizontalLineToRelative(0.413f)
                curveToRelative(0.323f, 0f, 0.633f, -0.133f, 0.862f, -0.368f)
                arcToRelative(1.27f, 1.27f, 0f, false, false, 0.356f, -0.886f)
                curveToRelative(0f, -0.332f, -0.128f, -0.65f, -0.356f, -0.886f)
                arcToRelative(1.203f, 1.203f, 0f, false, false, -0.862f, -0.368f)
                horizontalLineToRelative(-0.826f)
                arcToRelative(1.2f, 1.2f, 0f, false, true, -0.861f, -0.367f)
                arcToRelative(1.27f, 1.27f, 0f, false, true, -0.356f, -0.886f)
                curveToRelative(0f, -0.332f, 0.128f, -0.651f, 0.356f, -0.886f)
                arcToRelative(1.2f, 1.2f, 0f, false, true, 0.861f, -0.368f)
                horizontalLineToRelative(0.413f)
                curveToRelative(0.816f, 0f, 1.178f, 0.133f, 1.515f, 0.423f)
            }
        }.build()
        
        return _BrandSamsungpass!!
    }

private var _BrandSamsungpass: ImageVector? = null

