package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SignMergeLeft: ImageVector
    get() {
        if (_SignMergeLeft != null) return _SignMergeLeft!!
        
        _SignMergeLeft = ImageVector.Builder(
            name = "sign-merge-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.25f, 6f)
                verticalLineToRelative(1f)
                quadToRelative(-0.211f, 0.451f, -0.588f, 0.95f)
                curveToRelative(-0.537f, 0.716f, -1.259f, 1.44f, -2.016f, 2.196f)
                lineToRelative(0.708f, 0.708f)
                lineToRelative(0.015f, -0.016f)
                curveToRelative(0.652f, -0.652f, 1.33f, -1.33f, 1.881f, -2.015f)
                verticalLineTo(12f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(6f)
                horizontalLineToRelative(1.216f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.192f, -0.41f)
                lineTo(8.192f, 3.23f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.384f, 0f)
                lineTo(5.842f, 5.59f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.192f, 0.41f)
                close()
            }
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
                moveToRelative(-1.4f, 0.7f)
                arcToRelative(0.495f, 0.495f, 0f, false, true, 0.7f, 0f)
                lineToRelative(6.516f, 6.515f)
                arcToRelative(0.495f, 0.495f, 0f, false, true, 0f, 0.7f)
                lineTo(8.35f, 14.866f)
                arcToRelative(0.495f, 0.495f, 0f, false, true, -0.7f, 0f)
                lineTo(1.134f, 8.35f)
                arcToRelative(0.495f, 0.495f, 0f, false, true, 0f, -0.7f)
                lineTo(7.65f, 1.134f)
                close()
            }
        }.build()
        
        return _SignMergeLeft!!
    }

private var _SignMergeLeft: ImageVector? = null

