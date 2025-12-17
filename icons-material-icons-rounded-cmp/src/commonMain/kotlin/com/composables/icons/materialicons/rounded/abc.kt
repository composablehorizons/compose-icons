package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Abc: ImageVector
    get() {
        if (_Abc != null) return _Abc!!
        
        _Abc = ImageVector.Builder(
            name = "abc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(7.25f, 15f)
                    curveToRelative(-0.41f, 0f, -0.75f, -0.34f, -0.75f, -0.75f)
                    verticalLineTo(13.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(0.75f)
                    curveTo(4.5f, 14.66f, 4.16f, 15f, 3.75f, 15f)
                    reflectiveCurveTo(3f, 14.66f, 3f, 14.25f)
                    verticalLineTo(10f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(3f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(4.25f)
                    curveTo(8f, 14.66f, 7.66f, 15f, 7.25f, 15f)
                    close()
                    moveTo(6.5f, 10.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(12f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(10.5f)
                    close()
                    moveTo(13.5f, 12f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(1f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-3f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-4f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(3f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(1f)
                    curveTo(14.5f, 11.55f, 14.05f, 12f, 13.5f, 12f)
                    close()
                    moveTo(11f, 10.5f)
                    verticalLineToRelative(0.75f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(10.5f)
                    horizontalLineTo(11f)
                    close()
                    moveTo(13f, 12.75f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(0.75f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(12.75f)
                    close()
                    moveTo(21f, 10.25f)
                    curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                    curveToRelative(-0.33f, 0f, -0.6f, -0.21f, -0.71f, -0.5f)
                    lineToRelative(-2.04f, 0f)
                    verticalLineToRelative(3f)
                    lineToRelative(2.04f, 0f)
                    curveToRelative(0.1f, -0.29f, 0.38f, -0.5f, 0.71f, -0.5f)
                    curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                    verticalLineTo(14f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineToRelative(-3f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-4f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(3f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineTo(10.25f)
                    close()
                }
            }
        }.build()
        
        return _Abc!!
    }

private var _Abc: ImageVector? = null

