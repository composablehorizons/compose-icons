package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Gripper: ImageVector
    get() {
        if (_Gripper != null) return _Gripper!!
        
        _Gripper = ImageVector.Builder(
            name = "gripper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 4f)
                curveTo(7f, 4.552f, 6.552f, 5f, 6f, 5f)
                curveTo(5.448f, 5f, 5f, 4.552f, 5f, 4f)
                curveTo(5f, 3.448f, 5.448f, 3f, 6f, 3f)
                curveTo(6.552f, 3f, 7f, 3.448f, 7f, 4f)
                close()
                moveTo(10f, 3f)
                curveTo(9.448f, 3f, 9f, 3.448f, 9f, 4f)
                curveTo(9f, 4.552f, 9.448f, 5f, 10f, 5f)
                curveTo(10.552f, 5f, 11f, 4.552f, 11f, 4f)
                curveTo(11f, 3.448f, 10.552f, 3f, 10f, 3f)
                close()
                moveTo(6f, 7f)
                curveTo(5.448f, 7f, 5f, 7.448f, 5f, 8f)
                curveTo(5f, 8.552f, 5.448f, 9f, 6f, 9f)
                curveTo(6.552f, 9f, 7f, 8.552f, 7f, 8f)
                curveTo(7f, 7.448f, 6.552f, 7f, 6f, 7f)
                close()
                moveTo(10f, 7f)
                curveTo(9.448f, 7f, 9f, 7.448f, 9f, 8f)
                curveTo(9f, 8.552f, 9.448f, 9f, 10f, 9f)
                curveTo(10.552f, 9f, 11f, 8.552f, 11f, 8f)
                curveTo(11f, 7.448f, 10.552f, 7f, 10f, 7f)
                close()
                moveTo(6f, 11f)
                curveTo(5.448f, 11f, 5f, 11.448f, 5f, 12f)
                curveTo(5f, 12.552f, 5.448f, 13f, 6f, 13f)
                curveTo(6.552f, 13f, 7f, 12.552f, 7f, 12f)
                curveTo(7f, 11.448f, 6.552f, 11f, 6f, 11f)
                close()
                moveTo(10f, 11f)
                curveTo(9.448f, 11f, 9f, 11.448f, 9f, 12f)
                curveTo(9f, 12.552f, 9.448f, 13f, 10f, 13f)
                curveTo(10.552f, 13f, 11f, 12.552f, 11f, 12f)
                curveTo(11f, 11.448f, 10.552f, 11f, 10f, 11f)
                close()
            }
        }.build()
        
        return _Gripper!!
    }

private var _Gripper: ImageVector? = null

