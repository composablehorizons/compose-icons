package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.BorderBottom: ImageVector
    get() {
        if (_BorderBottom != null) return _BorderBottom!!
        
        _BorderBottom = ImageVector.Builder(
            name = "border-bottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 13.25f)
                lineTo(14f, 13.25f)
                verticalLineTo(14.75f)
                lineTo(1f, 14.75f)
                verticalLineTo(13.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 5f)
                horizontalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 5.5f)
                verticalLineTo(5.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.5f, 6f)
                horizontalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 5.5f)
                verticalLineTo(5.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.5f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 5f)
                horizontalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 5.5f)
                verticalLineTo(5.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13.5f, 6f)
                horizontalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13f, 5.5f)
                verticalLineTo(5.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13.5f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 3f)
                horizontalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 3.5f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.5f, 4f)
                horizontalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 3.5f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.5f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 3f)
                horizontalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 3.5f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13.5f, 4f)
                horizontalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13f, 3.5f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13.5f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 7f)
                horizontalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.5f, 8f)
                horizontalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.5f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 1f)
                horizontalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.5f, 2f)
                horizontalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.5f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 7f)
                horizontalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13.5f, 8f)
                horizontalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13.5f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 1f)
                horizontalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13.5f, 2f)
                horizontalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13.5f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 7f)
                horizontalLineTo(5.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5.5f, 8f)
                horizontalLineTo(5.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5.5f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.5f, 1f)
                horizontalLineTo(5.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 6f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5.5f, 2f)
                horizontalLineTo(5.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5.5f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 7f)
                horizontalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3.5f, 8f)
                horizontalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3.5f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 1f)
                horizontalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3.5f, 2f)
                horizontalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3.5f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 7f)
                horizontalLineTo(9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9.5f, 8f)
                horizontalLineTo(9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9.5f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 1f)
                horizontalLineTo(9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9.5f, 2f)
                horizontalLineTo(9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9.5f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 7f)
                horizontalLineTo(11.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11.5f, 8f)
                horizontalLineTo(11.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11.5f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 1f)
                horizontalLineTo(11.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 12f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11.5f, 2f)
                horizontalLineTo(11.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 11.5f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 9f)
                horizontalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 9.5f)
                verticalLineTo(9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.5f, 10f)
                horizontalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 9.5f)
                verticalLineTo(9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.5f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 9f)
                horizontalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 9.5f)
                verticalLineTo(9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13.5f, 10f)
                horizontalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13f, 9.5f)
                verticalLineTo(9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13.5f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 11f)
                horizontalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 11.5f)
                verticalLineTo(11.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.5f, 12f)
                horizontalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 11.5f)
                verticalLineTo(11.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.5f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 11f)
                horizontalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14f, 11.5f)
                verticalLineTo(11.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13.5f, 12f)
                horizontalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13f, 11.5f)
                verticalLineTo(11.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 13.5f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 5f)
                horizontalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 5.5f)
                verticalLineTo(5.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1.5f, 6f)
                horizontalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1f, 5.5f)
                verticalLineTo(5.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1.5f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 3f)
                horizontalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 3.5f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1.5f, 4f)
                horizontalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1f, 3.5f)
                verticalLineTo(3.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1.5f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 7f)
                horizontalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1.5f, 8f)
                horizontalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1f, 7.5f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1.5f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 1f)
                horizontalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1.5f, 2f)
                horizontalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1f, 1.5f)
                verticalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1.5f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 9f)
                horizontalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 9.5f)
                verticalLineTo(9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1.5f, 10f)
                horizontalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1f, 9.5f)
                verticalLineTo(9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1.5f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 11f)
                horizontalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 11.5f)
                verticalLineTo(11.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1.5f, 12f)
                horizontalLineTo(1.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1f, 11.5f)
                verticalLineTo(11.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1.5f, 11f)
                close()
            }
        }.build()
        
        return _BorderBottom!!
    }

private var _BorderBottom: ImageVector? = null

