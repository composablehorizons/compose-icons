package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.GoToEditingSession: ImageVector
    get() {
        if (_GoToEditingSession != null) return _GoToEditingSession!!
        
        _GoToEditingSession = ImageVector.Builder(
            name = "go-to-editing-session",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 6.5f)
                verticalLineTo(13f)
                curveTo(13f, 14.103f, 12.103f, 15f, 11f, 15f)
                horizontalLineTo(4f)
                curveTo(2.897f, 15f, 2f, 14.103f, 2f, 13f)
                verticalLineTo(3f)
                curveTo(2f, 1.897f, 2.897f, 1f, 4f, 1f)
                horizontalLineTo(7.5f)
                curveTo(7.776f, 1f, 8f, 1.224f, 8f, 1.5f)
                curveTo(8f, 1.776f, 7.776f, 2f, 7.5f, 2f)
                horizontalLineTo(4f)
                curveTo(3.448f, 2f, 3f, 2.449f, 3f, 3f)
                verticalLineTo(13f)
                curveTo(3f, 13.551f, 3.448f, 14f, 4f, 14f)
                horizontalLineTo(11f)
                curveTo(11.552f, 14f, 12f, 13.551f, 12f, 13f)
                verticalLineTo(6.5f)
                curveTo(12f, 6.224f, 12.224f, 6f, 12.5f, 6f)
                curveTo(12.776f, 6f, 13f, 6.224f, 13f, 6.5f)
                close()
                moveTo(8f, 4.499f)
                curveTo(8f, 4.223f, 7.776f, 3.999f, 7.5f, 3.999f)
                curveTo(7.224f, 3.999f, 7f, 4.223f, 7f, 4.499f)
                verticalLineTo(5.999f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 5.999f, 5f, 6.223f, 5f, 6.499f)
                curveTo(5f, 6.775f, 5.224f, 6.999f, 5.5f, 6.999f)
                horizontalLineTo(7f)
                verticalLineTo(8.499f)
                curveTo(7f, 8.775f, 7.224f, 8.999f, 7.5f, 8.999f)
                curveTo(7.776f, 8.999f, 8f, 8.775f, 8f, 8.499f)
                verticalLineTo(6.999f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 6.999f, 10f, 6.775f, 10f, 6.499f)
                curveTo(10f, 6.223f, 9.776f, 5.999f, 9.5f, 5.999f)
                horizontalLineTo(8f)
                verticalLineTo(4.499f)
                close()
                moveTo(9.5f, 10.999f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 10.999f, 5f, 11.223f, 5f, 11.499f)
                curveTo(5f, 11.775f, 5.224f, 11.999f, 5.5f, 11.999f)
                horizontalLineTo(9.5f)
                curveTo(9.776f, 11.999f, 10f, 11.775f, 10f, 11.499f)
                curveTo(10f, 11.223f, 9.776f, 10.999f, 9.5f, 10.999f)
                close()
                moveTo(13.5f, 0f)
                horizontalLineTo(10.5f)
                curveTo(10.224f, 0f, 10f, 0.224f, 10f, 0.5f)
                curveTo(10f, 0.776f, 10.224f, 1f, 10.5f, 1f)
                horizontalLineTo(12.293f)
                lineTo(10.147f, 3.146f)
                curveTo(9.952f, 3.341f, 9.952f, 3.658f, 10.147f, 3.853f)
                curveTo(10.245f, 3.951f, 10.373f, 3.999f, 10.501f, 3.999f)
                curveTo(10.629f, 3.999f, 10.757f, 3.95f, 10.855f, 3.853f)
                lineTo(13.001f, 1.707f)
                verticalLineTo(3.5f)
                curveTo(13.001f, 3.776f, 13.225f, 4f, 13.501f, 4f)
                curveTo(13.777f, 4f, 14.001f, 3.776f, 14.001f, 3.5f)
                verticalLineTo(0.5f)
                curveTo(14.001f, 0.224f, 13.777f, 0f, 13.501f, 0f)
                horizontalLineTo(13.5f)
                close()
            }
        }.build()
        
        return _GoToEditingSession!!
    }

private var _GoToEditingSession: ImageVector? = null

