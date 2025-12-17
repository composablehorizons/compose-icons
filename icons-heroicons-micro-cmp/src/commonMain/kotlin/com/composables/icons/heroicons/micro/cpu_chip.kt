package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.CpuChip: ImageVector
    get() {
        if (_CpuChip != null) return _CpuChip!!
        
        _CpuChip = ImageVector.Builder(
            name = "cpu-chip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.75f, 1f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                horizontalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineTo(3f)
                verticalLineToRelative(0.75f)
                horizontalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineTo(3f)
                verticalLineToRelative(0.75f)
                horizontalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineTo(3f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(13f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(13f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(13f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(13f)
                verticalLineToRelative(-0.75f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(13f)
                verticalLineTo(6.5f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(13f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                verticalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineTo(3f)
                horizontalLineToRelative(-0.75f)
                verticalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineTo(3f)
                horizontalLineTo(6.5f)
                verticalLineTo(1.75f)
                arcTo(0.75f, 0.75f, 0f, false, false, 5.75f, 1f)
                close()
                moveTo(11f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _CpuChip!!
    }

private var _CpuChip: ImageVector? = null

