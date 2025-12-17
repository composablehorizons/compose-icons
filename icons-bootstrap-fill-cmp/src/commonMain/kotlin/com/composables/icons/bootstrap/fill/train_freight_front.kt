package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.TrainFreightFront: ImageVector
    get() {
        if (_TrainFreightFront != null) return _TrainFreightFront!!
        
        _TrainFreightFront = ImageVector.Builder(
            name = "train-freight-front",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.736f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.67f, 0.158f)
                lineTo(1.828f, 1.776f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1f, 3.118f)
                verticalLineToRelative(5.51f)
                lineToRelative(2f, -0.6f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(3.028f)
                lineToRelative(2f, 0.6f)
                verticalLineToRelative(-5.51f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.83f, -1.342f)
                lineTo(10.936f, 0.158f)
                arcTo(1.5f, 1.5f, 0f, false, false, 10.264f, 0f)
                close()
                moveTo(15f, 9.672f)
                lineToRelative(-5.503f, -1.65f)
                arcTo(0.5f, 0.5f, 0f, false, false, 9.353f, 8f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(4f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.5f, -2.5f)
                close()
                moveTo(7.5f, 16f)
                verticalLineTo(8f)
                horizontalLineToRelative(-0.853f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.144f, 0.021f)
                lineTo(1f, 9.672f)
                verticalLineTo(13.5f)
                arcTo(2.5f, 2.5f, 0f, false, false, 3.5f, 16f)
                close()
                moveToRelative(-1f, -14f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                moveTo(12f, 5f)
                verticalLineToRelative(2.728f)
                lineToRelative(-2.216f, -0.665f)
                arcTo(1.5f, 1.5f, 0f, false, false, 9.354f, 7f)
                horizontalLineTo(8.5f)
                verticalLineTo(5f)
                close()
                moveTo(7.5f, 5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-0.853f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.431f, 0.063f)
                lineTo(4f, 7.728f)
                verticalLineTo(5f)
                close()
                moveToRelative(-4f, 5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                moveToRelative(9f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                moveTo(5f, 13f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                moveToRelative(7f, 1f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
            }
        }.build()
        
        return _TrainFreightFront!!
    }

private var _TrainFreightFront: ImageVector? = null

