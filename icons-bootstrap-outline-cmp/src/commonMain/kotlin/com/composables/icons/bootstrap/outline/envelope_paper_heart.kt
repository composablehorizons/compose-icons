package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.EnvelopePaperHeart: ImageVector
    get() {
        if (_EnvelopePaperHeart != null) return _EnvelopePaperHeart!!
        
        _EnvelopePaperHeart = ImageVector.Builder(
            name = "envelope-paper-heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(1.133f)
                lineToRelative(0.941f, 0.502f)
                arcTo(2f, 2f, 0f, false, true, 16f, 5.4f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5.4f)
                arcToRelative(2f, 2f, 0f, false, true, 1.059f, -1.765f)
                lineTo(2f, 3.133f)
                close()
                moveToRelative(0f, 2.267f)
                lineToRelative(-0.47f, 0.25f)
                arcTo(1f, 1f, 0f, false, false, 1f, 5.4f)
                verticalLineToRelative(0.817f)
                lineToRelative(1f, 0.6f)
                close()
                moveToRelative(1f, 3.15f)
                lineToRelative(3.75f, 2.25f)
                lineTo(8f, 8.917f)
                lineToRelative(1.25f, 0.75f)
                lineTo(13f, 7.417f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                close()
                moveToRelative(11f, -0.6f)
                lineToRelative(1f, -0.6f)
                verticalLineTo(5.4f)
                arcToRelative(1f, 1f, 0f, false, false, -0.53f, -0.882f)
                lineTo(14f, 4.267f)
                close()
                moveTo(8f, 2.982f)
                curveTo(9.664f, 1.309f, 13.825f, 4.236f, 8f, 8f)
                curveTo(2.175f, 4.236f, 6.336f, 1.31f, 8f, 2.982f)
                moveToRelative(7f, 4.401f)
                lineToRelative(-4.778f, 2.867f)
                lineTo(15f, 13.117f)
                close()
                moveToRelative(-0.035f, 6.88f)
                lineTo(8f, 10.082f)
                lineToRelative(-6.965f, 4.18f)
                arcTo(1f, 1f, 0f, false, false, 2f, 15f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 0.965f, -0.738f)
                close()
                moveTo(1f, 13.116f)
                lineToRelative(4.778f, -2.867f)
                lineTo(1f, 7.383f)
                verticalLineToRelative(5.734f)
                close()
            }
        }.build()
        
        return _EnvelopePaperHeart!!
    }

private var _EnvelopePaperHeart: ImageVector? = null

