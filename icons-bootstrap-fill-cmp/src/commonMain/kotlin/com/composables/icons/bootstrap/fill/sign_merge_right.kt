package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SignMergeRight: ImageVector
    get() {
        if (_SignMergeRight != null) return _SignMergeRight!!
        
        _SignMergeRight = ImageVector.Builder(
            name = "sign-merge-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.05f, 0.435f)
                curveToRelative(-0.58f, -0.58f, -1.52f, -0.58f, -2.1f, 0f)
                lineTo(0.436f, 6.95f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.519f, 0f, 2.098f)
                lineToRelative(6.516f, 6.516f)
                curveToRelative(0.58f, 0.58f, 1.519f, 0.58f, 2.098f, 0f)
                lineToRelative(6.516f, -6.516f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.519f, 0f, -2.098f)
                close()
                moveTo(8.75f, 6f)
                verticalLineToRelative(1f)
                quadToRelative(0.211f, 0.451f, 0.588f, 0.95f)
                curveToRelative(0.537f, 0.716f, 1.259f, 1.44f, 2.016f, 2.196f)
                lineToRelative(-0.708f, 0.708f)
                lineToRelative(-0.015f, -0.016f)
                curveToRelative(-0.652f, -0.652f, -1.33f, -1.33f, -1.881f, -2.015f)
                verticalLineTo(12f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(6f)
                horizontalLineTo(6.034f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.192f, -0.41f)
                lineToRelative(1.966f, -2.36f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.384f, 0f)
                lineToRelative(1.966f, 2.36f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.192f, 0.41f)
                close()
            }
        }.build()
        
        return _SignMergeRight!!
    }

private var _SignMergeRight: ImageVector? = null

