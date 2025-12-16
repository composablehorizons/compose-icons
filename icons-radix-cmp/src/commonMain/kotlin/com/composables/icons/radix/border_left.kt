package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.BorderLeft: ImageVector
    get() {
        if (_BorderLeft != null) return _BorderLeft!!
        
        _BorderLeft = ImageVector.Builder(
            name = "border-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.75f, 1f)
                lineTo(1.75f, 14f)
                lineTo(0.249999f, 14f)
                lineTo(0.25f, 1f)
                lineTo(1.75f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 7f)
                horizontalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10.5f, 8f)
                horizontalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10.5f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 13f)
                horizontalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11f, 13.5f)
                verticalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10.5f, 14f)
                horizontalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10f, 13.5f)
                verticalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10.5f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 7f)
                horizontalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12.5f, 8f)
                horizontalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12.5f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 13f)
                horizontalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13f, 13.5f)
                verticalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12.5f, 14f)
                horizontalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12f, 13.5f)
                verticalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12.5f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 7f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 8f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 7f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 8f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 13f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 13.5f)
                verticalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 14f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 13.5f)
                verticalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 13f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 13.5f)
                verticalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 14f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 13.5f)
                verticalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 5f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 5.5f)
                verticalLineTo(5.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 6f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 5.5f)
                verticalLineTo(5.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 5f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 5.5f)
                verticalLineTo(5.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 6f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 5.5f)
                verticalLineTo(5.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 3f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 3.5f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 4f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 3.5f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 3f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 3.5f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 4f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 3.5f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 9f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 9.5f)
                verticalLineTo(9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 10f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 9.5f)
                verticalLineTo(9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 9f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 9.5f)
                verticalLineTo(9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 10f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 9.5f)
                verticalLineTo(9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 11f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 11.5f)
                verticalLineTo(11.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 12f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 11.5f)
                verticalLineTo(11.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 11f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 11.5f)
                verticalLineTo(11.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 12f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 11.5f)
                verticalLineTo(11.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 7f)
                horizontalLineTo(6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6.5f, 8f)
                horizontalLineTo(6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6.5f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 13f)
                horizontalLineTo(6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 13.5f)
                verticalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6.5f, 14f)
                horizontalLineTo(6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 13.5f)
                verticalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6.5f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 7f)
                horizontalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4.5f, 8f)
                horizontalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4.5f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 13f)
                horizontalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 13.5f)
                verticalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4.5f, 14f)
                horizontalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4f, 13.5f)
                verticalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4.5f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 1f)
                horizontalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10.5f, 2f)
                horizontalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10.5f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.5f, 1f)
                horizontalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12.5f, 2f)
                horizontalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12.5f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 1f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 2f)
                horizontalLineTo(8.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 1f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 2f)
                horizontalLineTo(14.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 1f)
                horizontalLineTo(6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6.5f, 2f)
                horizontalLineTo(6.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6.5f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 1f)
                horizontalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4.5f, 2f)
                horizontalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4.5f, 1f)
                close()
            }
        }.build()
        
        return _BorderLeft!!
    }

private var _BorderLeft: ImageVector? = null

