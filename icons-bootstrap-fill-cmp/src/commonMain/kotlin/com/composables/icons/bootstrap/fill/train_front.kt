package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.TrainFront: ImageVector
    get() {
        if (_TrainFront != null) return _TrainFront!!
        
        _TrainFront = ImageVector.Builder(
            name = "train-front",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.621f, 0.515f)
                curveTo(8.647f, 0.02f, 7.353f, 0.02f, 5.38f, 0.515f)
                curveToRelative(-0.924f, 0.23f, -1.982f, 0.766f, -2.78f, 1.22f)
                curveTo(1.566f, 2.322f, 1f, 3.432f, 1f, 4.582f)
                verticalLineTo(13.5f)
                arcTo(2.5f, 2.5f, 0f, false, false, 3.5f, 16f)
                horizontalLineToRelative(9f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 2.5f, -2.5f)
                verticalLineTo(4.583f)
                curveToRelative(0f, -1.15f, -0.565f, -2.26f, -1.6f, -2.849f)
                curveToRelative(-0.797f, -0.453f, -1.855f, -0.988f, -2.779f, -1.22f)
                close()
                moveTo(6.5f, 2f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                moveToRelative(-2f, 2f)
                horizontalLineToRelative(7f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13f, 5.5f)
                verticalLineToRelative(2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 11.5f, 9f)
                horizontalLineToRelative(-7f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3f, 7.5f)
                verticalLineToRelative(-2f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4.5f, 4f)
                moveToRelative(0.5f, 9f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                moveToRelative(0f, 0f)
                arcToRelative(1f, 1f, 0f, true, true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                moveToRelative(8f, 0f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                moveToRelative(-3f, -1f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                moveTo(4f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(8.5f, 8f)
                verticalLineTo(5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                close()
            }
        }.build()
        
        return _TrainFront!!
    }

private var _TrainFront: ImageVector? = null

