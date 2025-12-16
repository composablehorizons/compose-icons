package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.BorderAll: ImageVector
    get() {
        if (_BorderAll != null) return _BorderAll!!
        
        _BorderAll = ImageVector.Builder(
            name = "border-all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.25f, 1f)
                curveTo(0.25f, 0.585786f, 0.585786f, 0.25f, 1f, 0.25f)
                horizontalLineTo(14f)
                curveTo(14.4142f, 0.25f, 14.75f, 0.585786f, 14.75f, 1f)
                verticalLineTo(14f)
                curveTo(14.75f, 14.4142f, 14.4142f, 14.75f, 14f, 14.75f)
                horizontalLineTo(1f)
                curveTo(0.585786f, 14.75f, 0.25f, 14.4142f, 0.25f, 14f)
                verticalLineTo(1f)
                close()
                moveTo(1.75f, 1.75f)
                verticalLineTo(13.25f)
                horizontalLineTo(13.25f)
                verticalLineTo(1.75f)
                horizontalLineTo(1.75f)
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
        }.build()
        
        return _BorderAll!!
    }

private var _BorderAll: ImageVector? = null

