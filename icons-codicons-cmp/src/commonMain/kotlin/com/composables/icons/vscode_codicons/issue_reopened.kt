package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.IssueReopened: ImageVector
    get() {
        if (_IssueReopened != null) return _IssueReopened!!
        
        _IssueReopened = ImageVector.Builder(
            name = "issue-reopened",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 9f)
                curveTo(8.55228f, 9f, 9f, 8.55228f, 9f, 8f)
                curveTo(9f, 7.44772f, 8.55228f, 7f, 8f, 7f)
                curveTo(7.44772f, 7f, 7f, 7.44772f, 7f, 8f)
                curveTo(7f, 8.55228f, 7.44772f, 9f, 8f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 6f)
                horizontalLineTo(4.5f)
                curveTo(4.776f, 6f, 5f, 5.776f, 5f, 5.5f)
                curveTo(5f, 5.224f, 4.776f, 5f, 4.5f, 5f)
                horizontalLineTo(2.802f)
                curveTo(3.865f, 3.156f, 5.831f, 2f, 8f, 2f)
                curveTo(11.309f, 2f, 14f, 4.691f, 14f, 8f)
                curveTo(14f, 8.276f, 14.224f, 8.5f, 14.5f, 8.5f)
                curveTo(14.776f, 8.5f, 15f, 8.276f, 15f, 8f)
                curveTo(15f, 4.141f, 11.86f, 1f, 8f, 1f)
                curveTo(5.512f, 1f, 3.254f, 2.302f, 2f, 4.391f)
                verticalLineTo(2.5f)
                curveTo(2f, 2.224f, 1.776f, 2f, 1.5f, 2f)
                curveTo(1.224f, 2f, 1f, 2.224f, 1f, 2.5f)
                verticalLineTo(5.5f)
                curveTo(1f, 5.776f, 1.224f, 6f, 1.5f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 10f)
                horizontalLineTo(11.5f)
                curveTo(11.224f, 10f, 11f, 10.224f, 11f, 10.5f)
                curveTo(11f, 10.776f, 11.224f, 11f, 11.5f, 11f)
                horizontalLineTo(13.199f)
                curveTo(12.137f, 12.844f, 10.17f, 14f, 8f, 14f)
                curveTo(4.691f, 14f, 2f, 11.309f, 2f, 8f)
                curveTo(2f, 7.724f, 1.776f, 7.5f, 1.5f, 7.5f)
                curveTo(1.224f, 7.5f, 1f, 7.724f, 1f, 8f)
                curveTo(1f, 11.859f, 4.14f, 15f, 8f, 15f)
                curveTo(10.488f, 15f, 12.747f, 13.697f, 14f, 11.61f)
                verticalLineTo(13.5f)
                curveTo(14f, 13.776f, 14.224f, 14f, 14.5f, 14f)
                curveTo(14.776f, 14f, 15f, 13.776f, 15f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(15f, 10.224f, 14.776f, 10f, 14.5f, 10f)
                close()
            }
        }.build()
        
        return _IssueReopened!!
    }

private var _IssueReopened: ImageVector? = null

