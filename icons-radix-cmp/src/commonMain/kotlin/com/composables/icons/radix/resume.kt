package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.Resume: ImageVector
    get() {
        if (_Resume != null) return _Resume!!
        
        _Resume = ImageVector.Builder(
            name = "resume",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.49976f, 2.19995f)
                curveTo(2.80345f, 2.19995f, 3.04946f, 2.44609f, 3.04956f, 2.74976f)
                verticalLineTo(12.2498f)
                curveTo(3.04956f, 12.5535f, 2.80351f, 12.7996f, 2.49976f, 12.7996f)
                curveTo(2.19609f, 12.7995f, 1.94995f, 12.5534f, 1.94995f, 12.2498f)
                verticalLineTo(2.74976f)
                curveTo(1.95006f, 2.44615f, 2.19615f, 2.20006f, 2.49976f, 2.19995f)
                close()
                moveTo(5.24194f, 2.32202f)
                curveTo(5.39191f, 2.23163f, 5.57825f, 2.22575f, 5.73315f, 2.30737f)
                lineTo(14.7332f, 7.05737f)
                curveTo(14.8971f, 7.1439f, 14.9997f, 7.3144f, 14.9998f, 7.49976f)
                curveTo(14.9998f, 7.68519f, 14.8971f, 7.85559f, 14.7332f, 7.94214f)
                lineTo(5.73315f, 12.6921f)
                curveTo(5.57822f, 12.7738f, 5.39196f, 12.7679f, 5.24194f, 12.6775f)
                curveTo(5.092f, 12.587f, 4.99976f, 12.4249f, 4.99976f, 12.2498f)
                verticalLineTo(2.74976f)
                curveTo(4.99982f, 2.57461f, 5.09196f, 2.41248f, 5.24194f, 2.32202f)
                close()
                moveTo(5.99976f, 11.4197f)
                lineTo(13.4275f, 7.49976f)
                lineTo(5.99976f, 3.57886f)
                verticalLineTo(11.4197f)
                close()
            }
        }.build()
        
        return _Resume!!
    }

private var _Resume: ImageVector? = null

