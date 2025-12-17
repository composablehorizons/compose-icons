package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Extensions: ImageVector
    get() {
        if (_Extensions != null) return _Extensions!!
        
        _Extensions = ImageVector.Builder(
            name = "extensions",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 4.95703f)
                curveTo(15f, 4.58711f, 14.8563f, 4.24054f, 14.5949f, 3.97992f)
                lineTo(12.0096f, 1.39234f)
                curveTo(11.4879f, 0.86922f, 10.5788f, 0.86922f, 10.0571f, 1.39234f)
                lineTo(8f, 3.45119f)
                verticalLineTo(3.32321f)
                curveTo(8f, 2.55068f, 7.37187f, 1.922f, 6.6f, 1.922f)
                horizontalLineTo(2.4f)
                curveTo(1.62813f, 1.922f, 1f, 2.55068f, 1f, 3.32321f)
                verticalLineTo(13.5988f)
                curveTo(1f, 14.3713f, 1.62813f, 15f, 2.4f, 15f)
                horizontalLineTo(12.6667f)
                curveTo(13.4385f, 15f, 14.0667f, 14.3713f, 14.0667f, 13.5988f)
                verticalLineTo(9.39514f)
                curveTo(14.0667f, 8.62261f, 13.4385f, 7.99393f, 12.6667f, 7.99393f)
                horizontalLineTo(12.5379f)
                lineTo(14.5949f, 5.93508f)
                curveTo(14.8553f, 5.67445f, 15f, 5.32602f, 15f, 4.95703f)
                close()
                moveTo(2.4f, 2.85521f)
                horizontalLineTo(6.6f)
                curveTo(6.85667f, 2.85521f, 7.06667f, 3.06446f, 7.06667f, 3.32228f)
                verticalLineTo(7.99299f)
                horizontalLineTo(1.93333f)
                verticalLineTo(3.32228f)
                curveTo(1.93333f, 3.06446f, 2.14333f, 2.85521f, 2.4f, 2.85521f)
                close()
                moveTo(1.93333f, 13.5979f)
                verticalLineTo(8.92714f)
                horizontalLineTo(7.06667f)
                verticalLineTo(14.0649f)
                horizontalLineTo(2.4f)
                curveTo(2.14333f, 14.0649f, 1.93333f, 13.8547f, 1.93333f, 13.5979f)
                close()
                moveTo(13.1333f, 9.39421f)
                verticalLineTo(13.5979f)
                curveTo(13.1333f, 13.8547f, 12.9233f, 14.0649f, 12.6667f, 14.0649f)
                horizontalLineTo(8f)
                verticalLineTo(8.92714f)
                horizontalLineTo(12.6667f)
                curveTo(12.9233f, 8.92714f, 13.1333f, 9.13638f, 13.1333f, 9.39421f)
                close()
                moveTo(8f, 7.99299f)
                verticalLineTo(6.46287f)
                lineTo(9.5288f, 7.99299f)
                horizontalLineTo(8f)
                close()
                moveTo(13.9351f, 5.2737f)
                lineTo(11.3488f, 7.86221f)
                curveTo(11.1789f, 8.03223f, 10.8859f, 8.03223f, 10.716f, 7.86221f)
                lineTo(8.12973f, 5.2737f)
                curveTo(8.0448f, 5.18963f, 7.99813f, 5.07753f, 7.99813f, 4.95796f)
                curveTo(7.99813f, 4.83839f, 8.0448f, 4.7263f, 8.12973f, 4.64129f)
                lineTo(10.716f, 2.05278f)
                curveTo(10.8009f, 1.96777f, 10.9129f, 1.92106f, 11.0324f, 1.92106f)
                curveTo(11.1519f, 1.92106f, 11.2639f, 1.96777f, 11.3488f, 2.05278f)
                lineTo(13.9351f, 4.64129f)
                curveTo(14.02f, 4.72536f, 14.0667f, 4.83746f, 14.0667f, 4.95703f)
                curveTo(14.0667f, 5.0766f, 14.02f, 5.1887f, 13.9351f, 5.2737f)
                close()
            }
        }.build()
        
        return _Extensions!!
    }

private var _Extensions: ImageVector? = null

