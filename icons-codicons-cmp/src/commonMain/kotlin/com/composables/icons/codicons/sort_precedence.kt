package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SortPrecedence: ImageVector
    get() {
        if (_SortPrecedence != null) return _SortPrecedence!!
        
        _SortPrecedence = ImageVector.Builder(
            name = "sort-precedence",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.0008f, 1.5f)
                curveTo(4.0008f, 1.224f, 3.7768f, 1f, 3.5008f, 1f)
                curveTo(3.2248f, 1f, 2.9998f, 1.224f, 2.9998f, 1.5f)
                verticalLineTo(13.293f)
                lineTo(1.8538f, 12.147f)
                curveTo(1.6588f, 11.952f, 1.3418f, 11.952f, 1.1468f, 12.147f)
                curveTo(0.951799f, 12.342f, 0.951799f, 12.659f, 1.1468f, 12.854f)
                lineTo(3.1468f, 14.854f)
                curveTo(3.3418f, 15.049f, 3.6588f, 15.049f, 3.8538f, 14.854f)
                lineTo(5.8538f, 12.854f)
                curveTo(6.0488f, 12.659f, 6.0488f, 12.342f, 5.8538f, 12.147f)
                curveTo(5.6588f, 11.952f, 5.3418f, 11.952f, 5.1468f, 12.147f)
                lineTo(4.0008f, 13.293f)
                verticalLineTo(1.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.9998f, 2f)
                horizontalLineTo(6.99982f)
                curveTo(6.44982f, 2f, 5.99982f, 2.45f, 5.99982f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(6.99982f)
                verticalLineTo(3f)
                horizontalLineTo(13.9998f)
                verticalLineTo(8f)
                horizontalLineTo(12.9998f)
                verticalLineTo(9f)
                horizontalLineTo(13.9998f)
                curveTo(14.5498f, 9f, 14.9998f, 8.55f, 14.9998f, 8f)
                verticalLineTo(3f)
                curveTo(14.9998f, 2.45f, 14.5498f, 2f, 13.9998f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.9998f, 6f)
                horizontalLineTo(5.00079f)
                verticalLineTo(7f)
                horizontalLineTo(10.9998f)
                verticalLineTo(12f)
                horizontalLineTo(6.90879f)
                curveTo(6.96479f, 12.159f, 6.99979f, 12.327f, 6.99979f, 12.501f)
                curveTo(6.99979f, 12.674f, 6.96479f, 12.841f, 6.90879f, 13f)
                horizontalLineTo(10.9998f)
                curveTo(11.5518f, 13f, 11.9998f, 12.552f, 11.9998f, 12f)
                verticalLineTo(7f)
                curveTo(11.9998f, 6.448f, 11.5518f, 6f, 10.9998f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.99982f, 10f)
                curveTo(9.99982f, 10.5523f, 9.5521f, 11f, 8.99982f, 11f)
                curveTo(8.44753f, 11f, 7.99982f, 10.5523f, 7.99982f, 10f)
                curveTo(7.99982f, 9.44772f, 8.44753f, 9f, 8.99982f, 9f)
                curveTo(9.5521f, 9f, 9.99982f, 9.44772f, 9.99982f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.00079f, 8.995f)
                curveTo(5.00379f, 8.445f, 5.44879f, 8f, 5.99979f, 8f)
                curveTo(6.55179f, 8f, 6.99979f, 8.448f, 6.99979f, 9f)
                curveTo(6.99979f, 9.552f, 6.55079f, 10f, 5.99979f, 10f)
                curveTo(5.44879f, 10f, 5.00379f, 9.555f, 5.00079f, 9.005f)
                verticalLineTo(8.995f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.99982f, 4f)
                curveTo(8.44982f, 4f, 7.99982f, 4.45f, 7.99982f, 5f)
                horizontalLineTo(9.99982f)
                curveTo(9.99982f, 4.45f, 9.54982f, 4f, 8.99982f, 4f)
                close()
            }
        }.build()
        
        return _SortPrecedence!!
    }

private var _SortPrecedence: ImageVector? = null

