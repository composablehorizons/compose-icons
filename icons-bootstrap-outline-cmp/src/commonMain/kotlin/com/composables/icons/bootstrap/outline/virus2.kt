package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Virus2: ImageVector
    get() {
        if (_Virus2 != null) return _Virus2!!
        
        _Virus2 = ImageVector.Builder(
            name = "virus2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(1.143f)
                curveToRelative(0f, 0.557f, -0.407f, 1.025f, -0.921f, 1.24f)
                curveToRelative(-0.514f, 0.214f, -1.12f, 0.162f, -1.513f, -0.231f)
                lineToRelative(-0.809f, -0.809f)
                arcToRelative(1f, 1f, 0f, true, false, -1.414f, 1.414f)
                lineToRelative(0.809f, 0.809f)
                curveToRelative(0.394f, 0.394f, 0.445f, 0.999f, 0.23f, 1.513f)
                curveTo(3.169f, 6.593f, 2.7f, 7f, 2.144f, 7f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(1.143f)
                curveToRelative(0.557f, 0f, 1.025f, 0.407f, 1.24f, 0.921f)
                curveToRelative(0.214f, 0.514f, 0.163f, 1.12f, -0.231f, 1.513f)
                lineToRelative(-0.809f, 0.809f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 1.414f)
                lineToRelative(0.809f, -0.809f)
                curveToRelative(0.394f, -0.394f, 0.999f, -0.445f, 1.513f, -0.23f)
                curveToRelative(0.514f, 0.214f, 0.921f, 0.682f, 0.921f, 1.24f)
                verticalLineTo(15f)
                arcToRelative(1f, 1f, 0f, true, false, 2f, 0f)
                verticalLineToRelative(-1.143f)
                curveToRelative(0f, -0.557f, 0.407f, -1.025f, 0.921f, -1.24f)
                curveToRelative(0.514f, -0.214f, 1.12f, -0.162f, 1.513f, 0.231f)
                lineToRelative(0.809f, 0.809f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, -1.414f)
                lineToRelative(-0.809f, -0.809f)
                curveToRelative(-0.393f, -0.394f, -0.445f, -0.999f, -0.23f, -1.513f)
                curveToRelative(0.214f, -0.514f, 0.682f, -0.921f, 1.24f, -0.921f)
                horizontalLineTo(15f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                horizontalLineToRelative(-1.143f)
                curveToRelative(-0.557f, 0f, -1.025f, -0.407f, -1.24f, -0.921f)
                curveToRelative(-0.214f, -0.514f, -0.162f, -1.12f, 0.231f, -1.513f)
                lineToRelative(0.809f, -0.809f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, -1.414f)
                lineToRelative(-0.809f, 0.809f)
                curveToRelative(-0.394f, 0.393f, -0.999f, 0.445f, -1.513f, 0.23f)
                curveToRelative(-0.514f, -0.214f, -0.92f, -0.682f, -0.92f, -1.24f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveToRelative(2f, 5f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                moveTo(7f, 7f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                moveToRelative(1f, 5f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                moveToRelative(4f, -4f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
            }
        }.build()
        
        return _Virus2!!
    }

private var _Virus2: ImageVector? = null

