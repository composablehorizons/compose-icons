package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.TrainFreightFront: ImageVector
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
                moveTo(5.065f, 0.158f)
                arcTo(1.5f, 1.5f, 0f, false, true, 5.736f, 0f)
                horizontalLineToRelative(4.528f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.67f, 0.158f)
                lineToRelative(3.237f, 1.618f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.83f, 1.342f)
                verticalLineTo(13.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-9f)
                arcTo(2.5f, 2.5f, 0f, false, true, 1f, 13.5f)
                verticalLineTo(3.118f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.828f, -1.342f)
                close()
                moveTo(2f, 9.372f)
                verticalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 15f)
                horizontalLineToRelative(4f)
                verticalLineTo(8f)
                horizontalLineToRelative(-0.853f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.144f, 0.021f)
                close()
                moveTo(8.5f, 15f)
                horizontalLineToRelative(4f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(9.372f)
                lineToRelative(-4.503f, -1.35f)
                arcTo(0.5f, 0.5f, 0f, false, false, 9.353f, 8f)
                horizontalLineTo(8.5f)
                close()
                moveTo(14f, 8.328f)
                verticalLineToRelative(-5.21f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.276f, -0.447f)
                lineToRelative(-3.236f, -1.618f)
                arcTo(0.5f, 0.5f, 0f, false, false, 10.264f, 1f)
                horizontalLineTo(5.736f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.223f, 0.053f)
                lineTo(2.277f, 2.67f)
                arcTo(0.5f, 0.5f, 0f, false, false, 2f, 3.118f)
                verticalLineToRelative(5.21f)
                lineToRelative(1f, -0.3f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(3.028f)
                close()
                moveToRelative(-2f, -0.6f)
                verticalLineTo(5f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(0.853f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.431f, 0.063f)
                close()
                moveTo(7.5f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                verticalLineToRelative(2.728f)
                lineToRelative(2.216f, -0.665f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6.646f, 7f)
                close()
                moveToRelative(-1f, -5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
                moveToRelative(-3f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                moveToRelative(9f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                moveTo(5f, 13f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                moveToRelative(7f, 1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
            }
        }.build()
        
        return _TrainFreightFront!!
    }

private var _TrainFreightFront: ImageVector? = null

