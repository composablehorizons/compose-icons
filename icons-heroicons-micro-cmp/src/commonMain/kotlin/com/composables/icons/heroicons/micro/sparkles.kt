package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Sparkles: ImageVector
    get() {
        if (_Sparkles != null) return _Sparkles!!
        
        _Sparkles = ImageVector.Builder(
            name = "sparkles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 4f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.738f, 0.616f)
                lineToRelative(0.252f, 1.388f)
                arcTo(1.25f, 1.25f, 0f, false, false, 6.996f, 7.01f)
                lineToRelative(1.388f, 0.252f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.476f)
                lineToRelative(-1.388f, 0.252f)
                arcTo(1.25f, 1.25f, 0f, false, false, 5.99f, 9.996f)
                lineToRelative(-0.252f, 1.388f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.476f, 0f)
                lineTo(4.01f, 9.996f)
                arcTo(1.25f, 1.25f, 0f, false, false, 3.004f, 8.99f)
                lineToRelative(-1.388f, -0.252f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.476f)
                lineToRelative(1.388f, -0.252f)
                arcTo(1.25f, 1.25f, 0f, false, false, 4.01f, 6.004f)
                lineToRelative(0.252f, -1.388f)
                arcTo(0.75f, 0.75f, 0f, false, true, 5f, 4f)
                close()
                moveTo(12f, 1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.721f, 0.544f)
                lineToRelative(0.195f, 0.682f)
                curveToRelative(0.118f, 0.415f, 0.443f, 0.74f, 0.858f, 0.858f)
                lineToRelative(0.682f, 0.195f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.442f)
                lineToRelative(-0.682f, 0.195f)
                arcToRelative(1.25f, 1.25f, 0f, false, false, -0.858f, 0.858f)
                lineToRelative(-0.195f, 0.682f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.442f, 0f)
                lineToRelative(-0.195f, -0.682f)
                arcToRelative(1.25f, 1.25f, 0f, false, false, -0.858f, -0.858f)
                lineToRelative(-0.682f, -0.195f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.442f)
                lineToRelative(0.682f, -0.195f)
                arcToRelative(1.25f, 1.25f, 0f, false, false, 0.858f, -0.858f)
                lineToRelative(0.195f, -0.682f)
                arcTo(0.75f, 0.75f, 0f, false, true, 12f, 1f)
                close()
                moveTo(10f, 11f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.728f, 0.568f)
                arcToRelative(0.968f, 0.968f, 0f, false, false, 0.704f, 0.704f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.456f)
                arcToRelative(0.968f, 0.968f, 0f, false, false, -0.704f, 0.704f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.456f, 0f)
                arcToRelative(0.968f, 0.968f, 0f, false, false, -0.704f, -0.704f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.456f)
                arcToRelative(0.968f, 0.968f, 0f, false, false, 0.704f, -0.704f)
                arcTo(0.75f, 0.75f, 0f, false, true, 10f, 11f)
                close()
            }
        }.build()
        
        return _Sparkles!!
    }

private var _Sparkles: ImageVector? = null

