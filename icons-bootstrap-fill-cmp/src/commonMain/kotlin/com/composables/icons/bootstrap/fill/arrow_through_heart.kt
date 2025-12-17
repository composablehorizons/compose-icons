package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ArrowThroughHeart: ImageVector
    get() {
        if (_ArrowThroughHeart != null) return _ArrowThroughHeart!!
        
        _ArrowThroughHeart = ImageVector.Builder(
            name = "arrow-through-heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.854f, 15.854f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 15.5f)
                verticalLineTo(14f)
                horizontalLineTo(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.354f, -0.854f)
                lineToRelative(1.5f, -1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 11.5f)
                horizontalLineToRelative(1.793f)
                lineToRelative(3.103f, -3.104f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, 0.708f)
                lineTo(4.5f, 12.207f)
                verticalLineTo(14f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.146f, 0.354f)
                close()
                moveTo(16f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.854f, 0.354f)
                lineTo(14f, 2.707f)
                lineToRelative(-1.006f, 1.006f)
                curveToRelative(0.236f, 0.248f, 0.44f, 0.531f, 0.6f, 0.845f)
                curveToRelative(0.562f, 1.096f, 0.585f, 2.517f, -0.213f, 4.092f)
                curveToRelative(-0.793f, 1.563f, -2.395f, 3.288f, -5.105f, 5.08f)
                lineTo(8f, 13.912f)
                lineToRelative(-0.276f, -0.182f)
                arcTo(24f, 24f, 0f, false, true, 5.8f, 12.323f)
                lineTo(8.31f, 9.81f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -2.122f, -2.122f)
                lineTo(3.657f, 10.22f)
                arcToRelative(9f, 9f, 0f, false, true, -1.039f, -1.57f)
                curveToRelative(-0.798f, -1.576f, -0.775f, -2.997f, -0.213f, -4.093f)
                curveTo(3.426f, 2.565f, 6.18f, 1.809f, 8f, 3.233f)
                curveToRelative(1.25f, -0.98f, 2.944f, -0.928f, 4.212f, -0.152f)
                lineTo(13.292f, 2f)
                lineTo(12.147f, 0.854f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12.5f, 0f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                close()
            }
        }.build()
        
        return _ArrowThroughHeart!!
    }

private var _ArrowThroughHeart: ImageVector? = null

