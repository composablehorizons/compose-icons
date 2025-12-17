package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.CpuChip: ImageVector
    get() {
        if (_CpuChip != null) return _CpuChip!!
        
        _CpuChip = ImageVector.Builder(
            name = "cpu-chip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 6f)
                horizontalLineTo(6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                verticalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.25f, 3f)
                verticalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineTo(3f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineTo(3f)
                horizontalLineToRelative(0.5f)
                arcTo(2.75f, 2.75f, 0f, false, true, 17f, 5.75f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(17f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(17f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(17f)
                verticalLineToRelative(0.5f)
                arcTo(2.75f, 2.75f, 0f, false, true, 14.25f, 17f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(17f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(17f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(17f)
                horizontalLineToRelative(-0.5f)
                arcTo(2.75f, 2.75f, 0f, false, true, 3f, 14.25f)
                verticalLineToRelative(-0.5f)
                horizontalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineTo(3f)
                verticalLineToRelative(-1.5f)
                horizontalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineTo(3f)
                verticalLineToRelative(-1.5f)
                horizontalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineTo(3f)
                verticalLineToRelative(-0.5f)
                arcTo(2.75f, 2.75f, 0f, false, true, 5.75f, 3f)
                horizontalLineToRelative(0.5f)
                verticalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineTo(3f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(4.5f, 5.75f)
                curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(8.5f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineToRelative(-8.5f)
                curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                verticalLineToRelative(-8.5f)
                close()
            }
        }.build()
        
        return _CpuChip!!
    }

private var _CpuChip: ImageVector? = null

