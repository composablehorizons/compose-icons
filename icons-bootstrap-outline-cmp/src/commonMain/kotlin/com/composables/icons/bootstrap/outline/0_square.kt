package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.`0Square`: ImageVector
    get() {
        if (_0Square != null) return _0Square!!
        
        _0Square = ImageVector.Builder(
            name = "0-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.988f, 12.158f)
                curveToRelative(-1.851f, 0f, -2.941f, -1.57f, -2.941f, -3.99f)
                verticalLineTo(7.84f)
                curveToRelative(0f, -2.408f, 1.101f, -3.996f, 2.965f, -3.996f)
                curveToRelative(1.857f, 0f, 2.935f, 1.57f, 2.935f, 3.996f)
                verticalLineToRelative(0.328f)
                curveToRelative(0f, 2.408f, -1.101f, 3.99f, -2.959f, 3.99f)
                moveTo(8f, 4.951f)
                curveToRelative(-1.008f, 0f, -1.629f, 1.09f, -1.629f, 2.895f)
                verticalLineToRelative(0.31f)
                curveToRelative(0f, 1.81f, 0.627f, 2.895f, 1.629f, 2.895f)
                reflectiveCurveToRelative(1.623f, -1.09f, 1.623f, -2.895f)
                verticalLineToRelative(-0.31f)
                curveToRelative(0f, -1.8f, -0.621f, -2.895f, -1.623f, -2.895f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(15f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                close()
            }
        }.build()
        
        return _0Square!!
    }

private var _0Square: ImageVector? = null

