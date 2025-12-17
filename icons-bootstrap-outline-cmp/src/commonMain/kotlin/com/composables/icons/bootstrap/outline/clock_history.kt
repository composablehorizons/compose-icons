package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ClockHistory: ImageVector
    get() {
        if (_ClockHistory != null) return _ClockHistory!!
        
        _ClockHistory = ImageVector.Builder(
            name = "clock-history",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.515f, 1.019f)
                arcTo(7f, 7f, 0f, false, false, 8f, 1f)
                verticalLineTo(0f)
                arcToRelative(8f, 8f, 0f, false, true, 0.589f, 0.022f)
                close()
                moveToRelative(2.004f, 0.45f)
                arcToRelative(7f, 7f, 0f, false, false, -0.985f, -0.299f)
                lineToRelative(0.219f, -0.976f)
                quadToRelative(0.576f, 0.129f, 1.126f, 0.342f)
                close()
                moveToRelative(1.37f, 0.71f)
                arcToRelative(7f, 7f, 0f, false, false, -0.439f, -0.27f)
                lineToRelative(0.493f, -0.87f)
                arcToRelative(8f, 8f, 0f, false, true, 0.979f, 0.654f)
                lineToRelative(-0.615f, 0.789f)
                arcToRelative(7f, 7f, 0f, false, false, -0.418f, -0.302f)
                close()
                moveToRelative(1.834f, 1.79f)
                arcToRelative(7f, 7f, 0f, false, false, -0.653f, -0.796f)
                lineToRelative(0.724f, -0.69f)
                quadToRelative(0.406f, 0.429f, 0.747f, 0.91f)
                close()
                moveToRelative(0.744f, 1.352f)
                arcToRelative(7f, 7f, 0f, false, false, -0.214f, -0.468f)
                lineToRelative(0.893f, -0.45f)
                arcToRelative(8f, 8f, 0f, false, true, 0.45f, 1.088f)
                lineToRelative(-0.95f, 0.313f)
                arcToRelative(7f, 7f, 0f, false, false, -0.179f, -0.483f)
                moveToRelative(0.53f, 2.507f)
                arcToRelative(7f, 7f, 0f, false, false, -0.1f, -1.025f)
                lineToRelative(0.985f, -0.17f)
                quadToRelative(0.1f, 0.58f, 0.116f, 1.17f)
                close()
                moveToRelative(-0.131f, 1.538f)
                quadToRelative(0.05f, -0.254f, 0.081f, -0.51f)
                lineToRelative(0.993f, 0.123f)
                arcToRelative(8f, 8f, 0f, false, true, -0.23f, 1.155f)
                lineToRelative(-0.964f, -0.267f)
                quadToRelative(0.069f, -0.247f, 0.12f, -0.501f)
                moveToRelative(-0.952f, 2.379f)
                quadToRelative(0.276f, -0.436f, 0.486f, -0.908f)
                lineToRelative(0.914f, 0.405f)
                quadToRelative(-0.24f, 0.54f, -0.555f, 1.038f)
                close()
                moveToRelative(-0.964f, 1.205f)
                quadToRelative(0.183f, -0.183f, 0.35f, -0.378f)
                lineToRelative(0.758f, 0.653f)
                arcToRelative(8f, 8f, 0f, false, true, -0.401f, 0.432f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(7f, 7f, 0f, true, false, 4.95f, 11.95f)
                lineToRelative(0.707f, 0.707f)
                arcTo(8.001f, 8.001f, 0f, true, true, 8f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(5.21f)
                lineToRelative(3.248f, 1.856f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.496f, 0.868f)
                lineToRelative(-3.5f, -2f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 9f)
                verticalLineTo(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
            }
        }.build()
        
        return _ClockHistory!!
    }

private var _ClockHistory: ImageVector? = null

