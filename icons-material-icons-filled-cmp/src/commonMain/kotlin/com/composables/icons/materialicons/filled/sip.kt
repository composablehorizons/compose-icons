package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Sip: ImageVector
    get() {
        if (_Sip != null) return _Sip!!
        
        _Sip = ImageVector.Builder(
            name = "sip",
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
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.5f, 10.5f)
                        horizontalLineTo(17.5f)
                        verticalLineTo(11.5f)
                        horizontalLineTo(15.5f)
                        verticalLineTo(10.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 4f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(6f)
                        curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                        close()
                        moveTo(10f, 10.5f)
                        horizontalLineTo(6.5f)
                        verticalLineToRelative(0.75f)
                        horizontalLineTo(9f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineTo(14f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-1.5f)
                        horizontalLineToRelative(3.5f)
                        verticalLineToRelative(-0.75f)
                        horizontalLineTo(6f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        verticalLineTo(10f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(4f)
                        verticalLineTo(10.5f)
                        close()
                        moveTo(13f, 15f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(15f)
                        close()
                        moveTo(19f, 12f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineToRelative(-2.5f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(14f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineTo(12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sip!!
    }

private var _Sip: ImageVector? = null

