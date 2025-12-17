package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.VscodeInsiders: ImageVector
    get() {
        if (_VscodeInsiders != null) return _VscodeInsiders!!
        
        _VscodeInsiders = ImageVector.Builder(
            name = "vscode-insiders",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.7851f, 1.38063f)
                lineTo(5.56484f, 5.25081f)
                lineTo(7.68844f, 6.87114f)
                lineTo(10f, 5.10739f)
                verticalLineTo(2.00006f)
                curveTo(10f, 1.76613f, 9.91968f, 1.55096f, 9.7851f, 1.38063f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 9.89274f)
                lineTo(2.58433f, 4.23448f)
                curveTo(2.37657f, 4.07596f, 2.08597f, 4.08895f, 1.89301f, 4.26538f)
                lineTo(1.17719f, 4.9199f)
                curveTo(1.08223f, 5.00673f, 1.02543f, 5.11904f, 1.00681f, 5.23635f)
                curveTo(0.979153f, 5.41062f, 1.03574f, 5.59591f, 1.17661f, 5.7251f)
                lineTo(9.7851f, 13.6195f)
                curveTo(9.91968f, 13.4492f, 10f, 13.234f, 10f, 13.0001f)
                verticalLineTo(9.89274f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.7532f, 1.03687f)
                curveTo(10.9105f, 1.32257f, 11f, 1.65087f, 11f, 2.00006f)
                verticalLineTo(13.0001f)
                curveTo(11f, 13.3493f, 10.9105f, 13.6775f, 10.7532f, 13.9633f)
                curveTo(10.7906f, 13.9515f, 10.8274f, 13.937f, 10.8634f, 13.9196f)
                lineTo(13.5399f, 12.625f)
                curveTo(13.8211f, 12.489f, 14f, 12.2029f, 14f, 11.889f)
                verticalLineTo(3.11115f)
                curveTo(14f, 2.79727f, 13.8212f, 2.51116f, 13.5399f, 2.37513f)
                lineTo(10.8634f, 1.08054f)
                curveTo(10.8274f, 1.06312f, 10.7906f, 1.04858f, 10.7532f, 1.03687f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.17661f, 9.27502f)
                lineTo(2.37233f, 8.17848f)
                lineTo(4.00854f, 9.67896f)
                lineTo(2.58433f, 10.7657f)
                curveTo(2.37657f, 10.9242f, 2.08597f, 10.9112f, 1.89301f, 10.7348f)
                lineTo(1.17719f, 10.0802f)
                curveTo(0.941168f, 9.86443f, 0.940898f, 9.49118f, 1.17661f, 9.27502f)
                close()
            }
        }.build()
        
        return _VscodeInsiders!!
    }

private var _VscodeInsiders: ImageVector? = null

