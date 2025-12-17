package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.FileSettings: ImageVector
    get() {
        if (_FileSettings != null) return _FileSettings!!
        
        _FileSettings = ImageVector.Builder(
            name = "file-settings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, 0.876f, 0.876f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(4f)
                lineToRelative(0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, false, false, 1.838f, 1.844f)
                lineToRelative(0.157f, 0.006f)
                horizontalLineToRelative(4f)
                lineToRelative(0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, 0.876f, 0.876f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(9f)
                arcToRelative(3f, 3f, 0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                horizontalLineToRelative(-10f)
                arcToRelative(3f, 3f, 0f, false, true, -2.995f, -2.824f)
                lineToRelative(-0.005f, -0.176f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                close()
                moveToRelative(0f, 8.5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(0.67f)
                arcToRelative(3f, 3f, 0f, false, false, -0.909f, 0.516f)
                lineToRelative(-0.576f, -0.346f)
                arcToRelative(1f, 1f, 0f, false, false, -1.03f, 1.714f)
                lineToRelative(0.575f, 0.346f)
                quadToRelative(-0.043f, 0.207f, -0.055f, 0.424f)
                lineToRelative(-0.005f, 0.176f)
                quadToRelative(0f, 0.28f, 0.05f, 0.548f)
                lineToRelative(-0.582f, 0.336f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1.732f)
                lineToRelative(0.583f, -0.336f)
                curveToRelative(0.277f, 0.238f, 0.598f, 0.425f, 0.95f, 0.55f)
                lineToRelative(-0.001f, 0.67f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                verticalLineToRelative(-0.671f)
                curveToRelative(0.335f, -0.118f, 0.641f, -0.294f, 0.909f, -0.514f)
                lineToRelative(0.576f, 0.345f)
                arcToRelative(1f, 1f, 0f, false, false, 1.03f, -1.714f)
                lineToRelative(-0.575f, -0.346f)
                arcToRelative(3f, 3f, 0f, false, false, 0.01f, -1.148f)
                lineToRelative(0.581f, -0.336f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1.732f)
                lineToRelative(-0.582f, 0.335f)
                arcToRelative(3f, 3f, 0f, false, false, -0.948f, -0.548f)
                lineToRelative(-0.001f, -0.671f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                moveToRelative(0f, 3.5f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 7f)
                horizontalLineToRelative(-4f)
                lineToRelative(-0.001f, -4.001f)
                close()
            }
        }.build()
        
        return _FileSettings!!
    }

private var _FileSettings: ImageVector? = null

