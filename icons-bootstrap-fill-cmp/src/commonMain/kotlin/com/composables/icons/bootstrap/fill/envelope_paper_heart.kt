package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EnvelopePaperHeart: ImageVector
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
                moveTo(3f, 7.5f)
                lineToRelative(3.5f, 2f)
                lineTo(8f, 8.75f)
                lineToRelative(1.5f, 0.75f)
                lineToRelative(3.5f, -2f)
                verticalLineToRelative(-6f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11.5f, 0f)
                horizontalLineToRelative(-7f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3f, 1.5f)
                close()
                moveTo(2f, 3.133f)
                lineToRelative(-0.941f, 0.502f)
                arcTo(2f, 2f, 0f, false, false, 0f, 5.4f)
                verticalLineToRelative(0.313f)
                lineToRelative(2f, 1.173f)
                close()
                moveToRelative(12f, 3.753f)
                lineToRelative(2f, -1.173f)
                verticalLineTo(5.4f)
                arcToRelative(2f, 2f, 0f, false, false, -1.059f, -1.765f)
                lineTo(14f, 3.133f)
                close()
                moveToRelative(-3.693f, 3.324f)
                lineTo(16f, 6.873f)
                verticalLineToRelative(6.5f)
                close()
                moveToRelative(5.634f, 4.274f)
                lineTo(8f, 10.072f)
                lineTo(0.059f, 14.484f)
                arcTo(2f, 2f, 0f, false, false, 2f, 16f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 1.941f, -1.516f)
                moveTo(5.693f, 10.21f)
                lineTo(0f, 13.372f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(8f, 1.982f)
                curveTo(9.664f, 0.309f, 13.825f, 3.236f, 8f, 7f)
                curveTo(2.175f, 3.236f, 6.336f, 0.31f, 8f, 1.982f)
            }
        }.build()
        
        return _EnvelopePaperHeart!!
    }

private var _EnvelopePaperHeart: ImageVector? = null

