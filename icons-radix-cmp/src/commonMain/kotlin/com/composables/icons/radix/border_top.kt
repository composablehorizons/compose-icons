package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.BorderTop: ImageVector
    get() {
        if (_BorderTop != null) return _BorderTop!!
        
        _BorderTop = ImageVector.Builder(
            name = "border-top",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 1.75f)
                lineTo(1f, 1.75f)
                lineTo(1f, 0.249999f)
                lineTo(14f, 0.25f)
                lineTo(14f, 1.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 10f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 10.5f)
                verticalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 11f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 10.5f)
                verticalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 10f)
                horizontalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3f, 10.5f)
                verticalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2.5f, 11f)
                horizontalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 10.5f)
                verticalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2.5f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 12f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 12.5f)
                verticalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 13f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 12.5f)
                verticalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 12f)
                horizontalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3f, 12.5f)
                verticalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2.5f, 13f)
                horizontalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 12.5f)
                verticalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2.5f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 8f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 8.5f)
                verticalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 9f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 8.5f)
                verticalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 14f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 14.5f)
                verticalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 15f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 14.5f)
                verticalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 8f)
                horizontalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3f, 8.5f)
                verticalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2.5f, 9f)
                horizontalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 8.5f)
                verticalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2.5f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 14f)
                horizontalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3f, 14.5f)
                verticalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2.5f, 15f)
                horizontalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 14.5f)
                verticalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2.5f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 8f)
                horizontalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11f, 8.5f)
                verticalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10.5f, 9f)
                horizontalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10f, 8.5f)
                verticalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10.5f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 14f)
                horizontalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11f, 14.5f)
                verticalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10.5f, 15f)
                horizontalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10f, 14.5f)
                verticalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10.5f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 8f)
                horizontalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13f, 8.5f)
                verticalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12.5f, 9f)
                horizontalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12f, 8.5f)
                verticalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12.5f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 14f)
                horizontalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13f, 14.5f)
                verticalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12.5f, 15f)
                horizontalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12f, 14.5f)
                verticalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12.5f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 8f)
                horizontalLineTo(6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 8.5f)
                verticalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6.5f, 9f)
                horizontalLineTo(6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 8.5f)
                verticalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6.5f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 14f)
                horizontalLineTo(6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 14.5f)
                verticalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6.5f, 15f)
                horizontalLineTo(6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 14.5f)
                verticalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6.5f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 8f)
                horizontalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 8.5f)
                verticalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4.5f, 9f)
                horizontalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4f, 8.5f)
                verticalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4.5f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 14f)
                horizontalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 14.5f)
                verticalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4.5f, 15f)
                horizontalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4f, 14.5f)
                verticalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4.5f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 6f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 6.5f)
                verticalLineTo(6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 7f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 6.5f)
                verticalLineTo(6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 6f)
                horizontalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3f, 6.5f)
                verticalLineTo(6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2.5f, 7f)
                horizontalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 6.5f)
                verticalLineTo(6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2.5f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 4f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 4.5f)
                verticalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 5f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 4.5f)
                verticalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 4f)
                horizontalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3f, 4.5f)
                verticalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2.5f, 5f)
                horizontalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 4.5f)
                verticalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2.5f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 10f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 10.5f)
                verticalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 11f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 10.5f)
                verticalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 12f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 12.5f)
                verticalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 13f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 12.5f)
                verticalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 8f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 8.5f)
                verticalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 9f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 8.5f)
                verticalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 14f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 14.5f)
                verticalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 15f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 14.5f)
                verticalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 6f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 6.5f)
                verticalLineTo(6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 7f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 6.5f)
                verticalLineTo(6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 4f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 4.5f)
                verticalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 5f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 4.5f)
                verticalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 4f)
                close()
            }
        }.build()
        
        return _BorderTop!!
    }

private var _BorderTop: ImageVector? = null

