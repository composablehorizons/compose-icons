package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.LinkedinLogo: ImageVector
    get() {
        if (_LinkedinLogo != null) return _LinkedinLogo!!
        
        _LinkedinLogo = ImageVector.Builder(
            name = "linkedin-logo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 1f)
                curveTo(13.5523f, 1f, 14f, 1.44772f, 14f, 2f)
                verticalLineTo(13f)
                curveTo(14f, 13.5523f, 13.5523f, 14f, 13f, 14f)
                horizontalLineTo(2f)
                curveTo(1.44772f, 14f, 1f, 13.5523f, 1f, 13f)
                verticalLineTo(2f)
                curveTo(1f, 1.44772f, 1.44772f, 1f, 2f, 1f)
                horizontalLineTo(13f)
                close()
                moveTo(9.6748f, 5.85059f)
                curveTo(9.29545f, 5.83189f, 8.9175f, 5.91127f, 8.5791f, 6.08105f)
                curveTo(8.32209f, 6.21005f, 8.05222f, 6.50526f, 7.84473f, 7.01855f)
                horizontalLineTo(7.79199f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineTo(12.0049f)
                horizontalLineTo(7.90625f)
                verticalLineTo(8.81152f)
                curveTo(7.8787f, 8.48445f, 7.98312f, 8.06112f, 8.19727f, 7.80957f)
                curveTo(8.41141f, 7.5581f, 8.71797f, 7.49828f, 8.9502f, 7.46777f)
                horizontalLineTo(9.02246f)
                curveTo(9.62862f, 7.46777f, 10.0781f, 7.84339f, 10.0781f, 8.78906f)
                verticalLineTo(12.0049f)
                horizontalLineTo(11.9844f)
                lineTo(12f, 8.35742f)
                curveTo(12f, 6.55255f, 10.8336f, 5.85071f, 9.6748f, 5.85059f)
                close()
                moveTo(3.0498f, 12f)
                horizontalLineTo(4.9502f)
                verticalLineTo(6f)
                horizontalLineTo(3.0498f)
                verticalLineTo(12f)
                close()
                moveTo(4f, 2.92969f)
                curveTo(3.40633f, 2.92969f, 2.92487f, 3.41123f, 2.9248f, 4.00488f)
                curveTo(2.9248f, 4.59859f, 3.4063f, 5.08008f, 4f, 5.08008f)
                curveTo(4.59371f, 5.08008f, 5.0752f, 4.59859f, 5.0752f, 4.00488f)
                curveTo(5.07513f, 3.41123f, 4.59367f, 2.92969f, 4f, 2.92969f)
                close()
            }
        }.build()
        
        return _LinkedinLogo!!
    }

private var _LinkedinLogo: ImageVector? = null

