package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandGooglePhotos: ImageVector
    get() {
        if (_BrandGooglePhotos != null) return _BrandGooglePhotos!!
        
        _BrandGooglePhotos = ImageVector.Builder(
            name = "brand-google-photos",
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
                moveTo(7.5f, 7f)
                curveToRelative(2.485f, 0f, 4.5f, 1.974f, 4.5f, 4.409f)
                verticalLineToRelative(0.591f)
                horizontalLineToRelative(-8.397f)
                arcToRelative(0.61f, 0.61f, 0f, false, true, -0.426f, -0.173f)
                arcToRelative(0.585f, 0.585f, 0f, false, true, -0.177f, -0.418f)
                curveToRelative(0f, -2.435f, 2.015f, -4.409f, 4.5f, -4.409f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 17f)
                curveToRelative(-2.485f, 0f, -4.5f, -1.974f, -4.5f, -4.409f)
                verticalLineToRelative(-0.591f)
                horizontalLineToRelative(8.397f)
                curveToRelative(0.333f, 0f, 0.603f, 0.265f, 0.603f, 0.591f)
                curveToRelative(0f, 2.435f, -2.015f, 4.409f, -4.5f, 4.409f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 16.5f)
                curveToRelative(0f, -2.485f, 1.972f, -4.5f, 4.405f, -4.5f)
                horizontalLineToRelative(0.595f)
                verticalLineToRelative(8.392f)
                arcToRelative(0.61f, 0.61f, 0f, false, true, -0.173f, 0.431f)
                arcToRelative(0.584f, 0.584f, 0f, false, true, -0.422f, 0.177f)
                curveToRelative(-2.433f, 0f, -4.405f, -2.015f, -4.405f, -4.5f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 7.5f)
                curveToRelative(0f, 2.485f, -1.972f, 4.5f, -4.405f, 4.5f)
                horizontalLineToRelative(-0.595f)
                verticalLineToRelative(-8.397f)
                arcToRelative(0.61f, 0.61f, 0f, false, true, 0.175f, -0.428f)
                arcToRelative(0.584f, 0.584f, 0f, false, true, 0.42f, -0.175f)
                curveToRelative(2.433f, 0f, 4.405f, 2.015f, 4.405f, 4.5f)
                close()
            }
        }.build()
        
        return _BrandGooglePhotos!!
    }

private var _BrandGooglePhotos: ImageVector? = null

