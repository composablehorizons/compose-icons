package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CupHot: ImageVector
    get() {
        if (_CupHot != null) return _CupHot!!
        
        _CupHot = ImageVector.Builder(
            name = "cup-hot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.5f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.488f, 0.608f)
                lineToRelative(1.652f, 7.434f)
                arcTo(2.5f, 2.5f, 0f, false, false, 4.104f, 16f)
                horizontalLineToRelative(5.792f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.44f, -1.958f)
                lineToRelative(0.131f, -0.59f)
                arcToRelative(3f, 3f, 0f, false, false, 1.3f, -5.854f)
                lineToRelative(0.221f, -0.99f)
                arcTo(0.5f, 0.5f, 0f, false, false, 13.5f, 6f)
                close()
                moveTo(13f, 12.5f)
                arcToRelative(2f, 2f, 0f, false, true, -0.316f, -0.025f)
                lineToRelative(0.867f, -3.898f)
                arcTo(2.001f, 2.001f, 0f, false, true, 13f, 12.5f)
                moveTo(2.64f, 13.825f)
                lineTo(1.123f, 7f)
                horizontalLineToRelative(11.754f)
                lineToRelative(-1.517f, 6.825f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9.896f, 15f)
                horizontalLineTo(4.104f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.464f, -1.175f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.4f, 0.8f)
                lineToRelative(-0.003f, 0.004f)
                lineToRelative(-0.014f, 0.019f)
                arcToRelative(4f, 4f, 0f, false, false, -0.204f, 0.31f)
                arcToRelative(2f, 2f, 0f, false, false, -0.141f, 0.267f)
                curveToRelative(-0.026f, 0.06f, -0.034f, 0.092f, -0.037f, 0.103f)
                verticalLineToRelative(0.004f)
                arcToRelative(0.6f, 0.6f, 0f, false, false, 0.091f, 0.248f)
                curveToRelative(0.075f, 0.133f, 0.178f, 0.272f, 0.308f, 0.445f)
                lineToRelative(0.01f, 0.012f)
                curveToRelative(0.118f, 0.158f, 0.26f, 0.347f, 0.37f, 0.543f)
                curveToRelative(0.112f, 0.2f, 0.22f, 0.455f, 0.22f, 0.745f)
                curveToRelative(0f, 0.188f, -0.065f, 0.368f, -0.119f, 0.494f)
                arcToRelative(3f, 3f, 0f, false, true, -0.202f, 0.388f)
                arcToRelative(5f, 5f, 0f, false, true, -0.253f, 0.382f)
                lineToRelative(-0.018f, 0.025f)
                lineToRelative(-0.005f, 0.008f)
                lineToRelative(-0.002f, 0.002f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3.6f, 4.2f)
                lineToRelative(0.003f, -0.004f)
                lineToRelative(0.014f, -0.019f)
                arcToRelative(4f, 4f, 0f, false, false, 0.204f, -0.31f)
                arcToRelative(2f, 2f, 0f, false, false, 0.141f, -0.267f)
                curveToRelative(0.026f, -0.06f, 0.034f, -0.092f, 0.037f, -0.103f)
                arcToRelative(0.6f, 0.6f, 0f, false, false, -0.09f, -0.252f)
                arcTo(4f, 4f, 0f, false, false, 3.6f, 2.8f)
                lineToRelative(-0.01f, -0.012f)
                arcToRelative(5f, 5f, 0f, false, true, -0.37f, -0.543f)
                arcTo(1.53f, 1.53f, 0f, false, true, 3f, 1.5f)
                curveToRelative(0f, -0.188f, 0.065f, -0.368f, 0.119f, -0.494f)
                curveToRelative(0.059f, -0.138f, 0.134f, -0.274f, 0.202f, -0.388f)
                arcToRelative(6f, 6f, 0f, false, true, 0.253f, -0.382f)
                lineToRelative(0.025f, -0.035f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4.4f, 0.8f)
                moveToRelative(3f, 0f)
                lineToRelative(-0.003f, 0.004f)
                lineToRelative(-0.014f, 0.019f)
                arcToRelative(4f, 4f, 0f, false, false, -0.204f, 0.31f)
                arcToRelative(2f, 2f, 0f, false, false, -0.141f, 0.267f)
                curveToRelative(-0.026f, 0.06f, -0.034f, 0.092f, -0.037f, 0.103f)
                verticalLineToRelative(0.004f)
                arcToRelative(0.6f, 0.6f, 0f, false, false, 0.091f, 0.248f)
                curveToRelative(0.075f, 0.133f, 0.178f, 0.272f, 0.308f, 0.445f)
                lineToRelative(0.01f, 0.012f)
                curveToRelative(0.118f, 0.158f, 0.26f, 0.347f, 0.37f, 0.543f)
                curveToRelative(0.112f, 0.2f, 0.22f, 0.455f, 0.22f, 0.745f)
                curveToRelative(0f, 0.188f, -0.065f, 0.368f, -0.119f, 0.494f)
                arcToRelative(3f, 3f, 0f, false, true, -0.202f, 0.388f)
                arcToRelative(5f, 5f, 0f, false, true, -0.253f, 0.382f)
                lineToRelative(-0.018f, 0.025f)
                lineToRelative(-0.005f, 0.008f)
                lineToRelative(-0.002f, 0.002f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6.6f, 4.2f)
                lineToRelative(0.003f, -0.004f)
                lineToRelative(0.014f, -0.019f)
                arcToRelative(4f, 4f, 0f, false, false, 0.204f, -0.31f)
                arcToRelative(2f, 2f, 0f, false, false, 0.141f, -0.267f)
                curveToRelative(0.026f, -0.06f, 0.034f, -0.092f, 0.037f, -0.103f)
                arcToRelative(0.6f, 0.6f, 0f, false, false, -0.09f, -0.252f)
                arcTo(4f, 4f, 0f, false, false, 6.6f, 2.8f)
                lineToRelative(-0.01f, -0.012f)
                arcToRelative(5f, 5f, 0f, false, true, -0.37f, -0.543f)
                arcTo(1.53f, 1.53f, 0f, false, true, 6f, 1.5f)
                curveToRelative(0f, -0.188f, 0.065f, -0.368f, 0.119f, -0.494f)
                curveToRelative(0.059f, -0.138f, 0.134f, -0.274f, 0.202f, -0.388f)
                arcToRelative(6f, 6f, 0f, false, true, 0.253f, -0.382f)
                lineToRelative(0.025f, -0.035f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.4f, 0.8f)
                moveToRelative(3f, 0f)
                lineToRelative(-0.003f, 0.004f)
                lineToRelative(-0.014f, 0.019f)
                arcToRelative(4f, 4f, 0f, false, false, -0.204f, 0.31f)
                arcToRelative(2f, 2f, 0f, false, false, -0.141f, 0.267f)
                curveToRelative(-0.026f, 0.06f, -0.034f, 0.092f, -0.037f, 0.103f)
                verticalLineToRelative(0.004f)
                arcToRelative(0.6f, 0.6f, 0f, false, false, 0.091f, 0.248f)
                curveToRelative(0.075f, 0.133f, 0.178f, 0.272f, 0.308f, 0.445f)
                lineToRelative(0.01f, 0.012f)
                curveToRelative(0.118f, 0.158f, 0.26f, 0.347f, 0.37f, 0.543f)
                curveToRelative(0.112f, 0.2f, 0.22f, 0.455f, 0.22f, 0.745f)
                curveToRelative(0f, 0.188f, -0.065f, 0.368f, -0.119f, 0.494f)
                arcToRelative(3f, 3f, 0f, false, true, -0.202f, 0.388f)
                arcToRelative(5f, 5f, 0f, false, true, -0.252f, 0.382f)
                lineToRelative(-0.019f, 0.025f)
                lineToRelative(-0.005f, 0.008f)
                lineToRelative(-0.002f, 0.002f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9.6f, 4.2f)
                lineToRelative(0.003f, -0.004f)
                lineToRelative(0.014f, -0.019f)
                arcToRelative(4f, 4f, 0f, false, false, 0.204f, -0.31f)
                arcToRelative(2f, 2f, 0f, false, false, 0.141f, -0.267f)
                curveToRelative(0.026f, -0.06f, 0.034f, -0.092f, 0.037f, -0.103f)
                arcToRelative(0.6f, 0.6f, 0f, false, false, -0.09f, -0.252f)
                arcTo(4f, 4f, 0f, false, false, 9.6f, 2.8f)
                lineToRelative(-0.01f, -0.012f)
                arcToRelative(5f, 5f, 0f, false, true, -0.37f, -0.543f)
                arcTo(1.53f, 1.53f, 0f, false, true, 9f, 1.5f)
                curveToRelative(0f, -0.188f, 0.065f, -0.368f, 0.119f, -0.494f)
                curveToRelative(0.059f, -0.138f, 0.134f, -0.274f, 0.202f, -0.388f)
                arcToRelative(6f, 6f, 0f, false, true, 0.253f, -0.382f)
                lineToRelative(0.025f, -0.035f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10.4f, 0.8f)
            }
        }.build()
        
        return _CupHot!!
    }

private var _CupHot: ImageVector? = null

