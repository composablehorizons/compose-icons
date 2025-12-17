package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.`0Circle`: ImageVector
    get() {
        if (_0Circle != null) return _0Circle!!
        
        _0Circle = ImageVector.Builder(
            name = "0-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
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
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveToRelative(-8.012f, 4.158f)
                curveToRelative(1.858f, 0f, 2.96f, -1.582f, 2.96f, -3.99f)
                verticalLineTo(7.84f)
                curveToRelative(0f, -2.426f, -1.079f, -3.996f, -2.936f, -3.996f)
                curveToRelative(-1.864f, 0f, -2.965f, 1.588f, -2.965f, 3.996f)
                verticalLineToRelative(0.328f)
                curveToRelative(0f, 2.42f, 1.09f, 3.99f, 2.941f, 3.99f)
            }
        }.build()
        
        return _0Circle!!
    }

private var _0Circle: ImageVector? = null

